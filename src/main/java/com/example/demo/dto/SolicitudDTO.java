package com.example.demo.dto;

import java.time.LocalDate;

public class SolicitudDTO {
	
	private Long idPractica;
    private String nombrePersona;   // Nombre del practicante
    private String apellidoPersona; // Apellido del practicante
    private String codigoPersona;   // Código del practicante
    private String nombreEmpresa;   // Nombre de la empresa
    private String nombreLinea;     // Línea de la práctica
    private String planPlan;        // Plan de carrera de la práctica
    private String nombreCarrera;   // Nombre de la carrera (puede ser obtenido del PlanCarrera)
    private String tipoSupervisor;  // Tipo de supervisor (dependiendo de la entidad Supervisor)
    private LocalDate fechaInicioPractica; // Fecha inicio de la práctica
    private LocalDate fechaFinPractica;    // Fecha fin de la práctica
    private Integer horasPlanPractica;     // Horas planificadas de la práctica
    private Double notaAcademicaPractica;  // Nota académica de la práctica
    private Double notaEmpresarialPractica; // Nota empresarial de la práctica
    private Double ponderadoFinalPractica; // Ponderado final de la práctica
    private String estadoEstado;           // Estado de la práctica (proceso, completado, etc.)
    
    // Constructor
    public SolicitudDTO(Long idPractica, String nombrePersona, String apellidoPersona, String codigoPersona,
			String nombreEmpresa, String nombreLinea, String planPlan, String nombreCarrera, String tipoSupervisor,
			LocalDate fechaInicioPractica, LocalDate fechaFinPractica, Integer horasPlanPractica,
			Double notaAcademicaPractica, Double notaEmpresarialPractica, Double ponderadoFinalPractica,
			String estadoEstado) {
		this.idPractica = idPractica;
		this.nombrePersona = nombrePersona;
		this.apellidoPersona = apellidoPersona;
		this.codigoPersona = codigoPersona;
		this.nombreEmpresa = nombreEmpresa;
		this.nombreLinea = nombreLinea;
		this.planPlan = planPlan;
		this.nombreCarrera = nombreCarrera;
		this.tipoSupervisor = tipoSupervisor;
		this.fechaInicioPractica = fechaInicioPractica;
		this.fechaFinPractica = fechaFinPractica;
		this.horasPlanPractica = horasPlanPractica;
		this.notaAcademicaPractica = notaAcademicaPractica;
		this.notaEmpresarialPractica = notaEmpresarialPractica;
		this.ponderadoFinalPractica = ponderadoFinalPractica;
		this.estadoEstado = estadoEstado;
	}

    // Getters y Setters
	public Long getIdPractica() {
		return idPractica;
	}

	public void setIdPractica(Long idPractica) {
		this.idPractica = idPractica;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getApellidoPersona() {
		return apellidoPersona;
	}

	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}

	public String getCodigoPersona() {
		return codigoPersona;
	}

	public void setCodigoPersona(String codigoPersona) {
		this.codigoPersona = codigoPersona;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombreLinea() {
		return nombreLinea;
	}

	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}

	public String getPlanPlan() {
		return planPlan;
	}

	public void setPlanPlan(String planPlan) {
		this.planPlan = planPlan;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public String getTipoSupervisor() {
		return tipoSupervisor;
	}

	public void setTipoSupervisor(String tipoSupervisor) {
		this.tipoSupervisor = tipoSupervisor;
	}

	public LocalDate getFechaInicioPractica() {
		return fechaInicioPractica;
	}

	public void setFechaInicioPractica(LocalDate fechaInicioPractica) {
		this.fechaInicioPractica = fechaInicioPractica;
	}

	public LocalDate getFechaFinPractica() {
		return fechaFinPractica;
	}

	public void setFechaFinPractica(LocalDate fechaFinPractica) {
		this.fechaFinPractica = fechaFinPractica;
	}

	public Integer getHorasPlanPractica() {
		return horasPlanPractica;
	}

	public void setHorasPlanPractica(Integer horasPlanPractica) {
		this.horasPlanPractica = horasPlanPractica;
	}

	public Double getNotaAcademicaPractica() {
		return notaAcademicaPractica;
	}

	public void setNotaAcademicaPractica(Double notaAcademicaPractica) {
		this.notaAcademicaPractica = notaAcademicaPractica;
	}

	public Double getNotaEmpresarialPractica() {
		return notaEmpresarialPractica;
	}

	public void setNotaEmpresarialPractica(Double notaEmpresarialPractica) {
		this.notaEmpresarialPractica = notaEmpresarialPractica;
	}

	public Double getPonderadoFinalPractica() {
		return ponderadoFinalPractica;
	}

	public void setPonderadoFinalPractica(Double ponderadoFinalPractica) {
		this.ponderadoFinalPractica = ponderadoFinalPractica;
	}

	public String getEstadoEstado() {
		return estadoEstado;
	}

	public void setEstadoEstado(String estadoEstado) {
		this.estadoEstado = estadoEstado;
	}
}
