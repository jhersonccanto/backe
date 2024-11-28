package com.example.demo.serviceimpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;

import java.util.Optional;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.dto.ImportResults;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.ExcelService;

@Service
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private RolRepository rolRepository;
     @Autowired
    private Usuario_Rol_Repository usuarioRolRepository;
   
    @Autowired
    private PracticanteRepository practicanteRepository;
    @Autowired
    private EmpresaRepository empresaRepository;
    @Autowired
    private RepresentanteLegalRepository representanteLegalRepository;
    @Autowired
    private PlanCarreraRepository planCarreraRepository;

    @Override
    public ImportResults importData(MultipartFile file) throws IOException, SQLException {
        ImportResults importResults = new ImportResults();
        Workbook workbook = null;
        try {
            // Read the Excel file
            workbook = new XSSFWorkbook(file.getInputStream());
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            int totalRows = 0;
            int processedRows = 0;
            int skippedRows = 0;

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                totalRows++;

                try {
                    // Extract data from each cell of the row
                    String nombre = getCellValue(row, 0);
                    String apellido = getCellValue(row, 1);
                    String email = getCellValue(row, 2);
                    String dni = getCellValue(row, 3);
                    String telefono = getCellValue(row, 4);
                    String codigo = getCellValue(row, 5);

                    // Validate data
                    if (email == null || dni == null || email.isEmpty() || dni.isEmpty()) {
                        importResults.addErrorMessage("Fila " + totalRows + ": Email o DNI vacío.");
                        skippedRows++;
                        continue;
                    }

                    // Check if the email or DNI already exists in the database
                    if (personaRepository.existsByEmail(email) || personaRepository.existsByDni(dni)) {
                        importResults.addErrorMessage("Fila " + totalRows + ": Email o DNI ya existe.");
                        skippedRows++;
                        continue;
                    }

                    // Create the Persona entity
                    Persona persona = new Persona();
                    persona.setNombre(nombre);
                    persona.setApellido(apellido);
                    persona.setEmail(email);
                    persona.setDni(dni);
                    persona.setTelefono(telefono);
                    persona.setCodigo(codigo);
                    persona.setEstado('A');  // Default active state

                    personaRepository.save(persona);

                    // Create the Usuario entity (assuming it exists)
                    Usuario usuario = new Usuario();
                    usuario.setPersona(persona);
                    usuario.setUsuario(email); // Assuming email is used as username
                    usuario.setClave("defaultPassword");  // You can set the password or encrypt it here
                    usuario.setEstado('A'); // Default active state

                    usuarioRepository.save(usuario);

                    Optional<Rol> optionalRol = rolRepository.findByNombre("ROLE_USER");

                    if (optionalRol.isPresent()) {
                        Rol rol = optionalRol.get();
                        
                        // Crear la relación usuario-rol
                        usuario_rol usuarioRol = new usuario_rol();
                        usuarioRol.setUsuario(usuario);
                        usuarioRol.setRol(rol);
                        usuarioRol.setEstado("A"); // Estado activo
                        
                        // Usar el repositorio inyectado para guardar la relación
                        usuarioRolRepository.save(usuarioRol);  // Asegúrate de usar la instancia del repositorio
                    } else {
                        System.out.println("El rol ROLE_USER no existe en el sistema.");
                    }
                    // Create Practicante
                    Practicante practicante = new Practicante();
                    practicante.setPersona(persona);
                    // You should assign values for PlanCarrera and other fields from the Excel if needed
                    practicante.setHorasAcumuladas(0);
                    practicante.setHorasPs(0);
                    practicante.setCiclo("Ciclo 1");
                    practicante.setGrupo("Grupo A");

                    practicanteRepository.save(practicante);

                    processedRows++;
                } catch (Exception e) {
                	 importResults.addErrorMessage("Fila " + totalRows + ": Error al procesar los datos. " + e.getMessage());
                     skippedRows++;
                 }
             }

             // Set the final counts to the result object
             importResults.setTotalRows(totalRows);
             importResults.setProcessedRows(processedRows);
             importResults.setSkippedRows(skippedRows);

         } catch (IOException e) {
             throw new IOException("Error al leer el archivo Excel: " + e.getMessage(), e);
         } finally {
             if (workbook != null) {
                 workbook.close();
             }
         }

         return importResults;
     }

     /**
      * Helper method to safely get the value of a cell as a String.
      *
      * @param row The Excel row.
      * @param cellIndex The index of the cell in the row.
      * @return The value of the cell as a String, or null if the cell is empty or invalid.
      */
    private String getCellValue(Row row, int cellIndex) {
        Cell cell = row.getCell(cellIndex);
        if (cell != null) {
            switch (cell.getCellType()) {
                case STRING:
                    return cell.getStringCellValue();
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        return cell.getDateCellValue().toString(); // Si es una fecha
                    }
                    return String.valueOf(cell.getNumericCellValue());
                case BOOLEAN:
                    return String.valueOf(cell.getBooleanCellValue());
                default:
                    return null;
            }
        }
        return null;
    }
 }
