package com.example.demo.dto;

public class RegistroDTO {

    // Datos de la empresa
    private String nombreEmpresa;
    private String rucEmpresa;
    private String telefonoEmpresa;
    private String correoEmpresa;
    private String direccionEmpresa;

    // Datos del representante
    private String nombreRepresentante;
    private String cargoRepresentante;
    private String correoRepresentante;
    private String telefonoRepresentante;
    
    public RegistroDTO(String nombreEmpresa, String rucEmpresa, String telefonoEmpresa, String correoEmpresa,
            String direccionEmpresa, String nombreRepresentante, String cargoRepresentante, String correoRepresentante,
            String telefonoRepresentante) {
        
        // Asignación de datos de la empresa
        this.nombreEmpresa = nombreEmpresa;
        this.rucEmpresa = rucEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.correoEmpresa = correoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        
        // Asignación de datos del representante
        this.nombreRepresentante = nombreRepresentante;
        this.cargoRepresentante = cargoRepresentante;
        this.correoRepresentante = correoRepresentante;
        this.telefonoRepresentante = telefonoRepresentante;
    }

    // Getters y Setters de los campos
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getCargoRepresentante() {
        return cargoRepresentante;
    }

    public void setCargoRepresentante(String cargoRepresentante) {
        this.cargoRepresentante = cargoRepresentante;
    }

    public String getCorreoRepresentante() {
        return correoRepresentante;
    }

    public void setCorreoRepresentante(String correoRepresentante) {
        this.correoRepresentante = correoRepresentante;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }
}
