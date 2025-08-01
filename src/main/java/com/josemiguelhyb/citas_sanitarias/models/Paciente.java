package com.josemiguelhyb.citas_sanitarias.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Paciente {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY) // Ya que no usamos BD de momento
	private Long id;	
	private String codigoIdentificacion;
	private LocalDate fechaNacimiento;
	private String dni;
	
	public Paciente() {
		
	}
	
	public Paciente(Long id, String codigoIdentificacion, LocalDate fechaNacimiento, String dni) {
		this.id = id;
		this.codigoIdentificacion = codigoIdentificacion;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}

	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}	
	
	@Override
	public String toString() {
	    return "Paciente{" +
	            "id=" + id +
	            ", codigoIdentificacion='" + codigoIdentificacion + '\'' +
	            ", fechaNacimiento=" + fechaNacimiento +
	            ", dni='" + dni + '\'' +
	            '}';
	}
}
