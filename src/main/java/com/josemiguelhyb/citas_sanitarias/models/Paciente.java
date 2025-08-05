package com.josemiguelhyb.citas_sanitarias.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "paciente")
public class Paciente extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "codigo_identificacion")
    private String codigoIdentificacion;    

    @Column(name = "passwd", nullable = false)
    private String password;

    private String dni;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private String direccion;

    private String localidad;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    private String genero;

    @Column(name = "numero_seguridad_social")
    private String numeroSeguridadSocial;

    public Paciente() {}

	public Paciente(String username, String codigoIdentificacion, String password, String dni,
			LocalDate fechaNacimiento, String direccion, String localidad, String codigoPostal, String genero,
			String numeroSeguridadSocial) {
		this.username = username;
		this.codigoIdentificacion = codigoIdentificacion;
		this.password = password;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.genero = genero;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}

	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	@Override
	public String toString() {
		return "Paciente [username=" + username + ", codigoIdentificacion=" + codigoIdentificacion + ", password="
				+ password + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", localidad=" + localidad + ", codigoPostal=" + codigoPostal + ", genero=" + genero
				+ ", numeroSeguridadSocial=" + numeroSeguridadSocial + "]";
	}    
}
