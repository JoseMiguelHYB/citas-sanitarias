package com.josemiguelhyb.citas_sanitarias.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "username", unique = true, nullable = false)
    private String username;
	
	@Column(name = "passwd", nullable = false)
    private String password;
	
	@Column(name = "especialidad")
    private String especialidad;

    @Column(name = "centro_salud")
    private String centroSalud;

    @Column(name = "direccion_centro")
    private String direccionCentro;

    @Column(name = "codigo_postal_centro")
    private String codigoPostalCentro;

    @Column(name = "consulta")
    private String consulta;
    
    public Medico() {
    	
    }

	public Medico(String username, String password, String especialidad, String centroSalud, String direccionCentro,
			String codigoPostalCentro, String consulta) {
		this.username = username;
		this.password = password;
		this.especialidad = especialidad;
		this.centroSalud = centroSalud;
		this.direccionCentro = direccionCentro;
		this.codigoPostalCentro = codigoPostalCentro;
		this.consulta = consulta;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCentroSalud() {
		return centroSalud;
	}

	public void setCentroSalud(String centroSalud) {
		this.centroSalud = centroSalud;
	}

	public String getDireccionCentro() {
		return direccionCentro;
	}

	public void setDireccionCentro(String direccionCentro) {
		this.direccionCentro = direccionCentro;
	}

	public String getCodigoPostalCentro() {
		return codigoPostalCentro;
	}

	public void setCodigoPostalCentro(String codigoPostalCentro) {
		this.codigoPostalCentro = codigoPostalCentro;
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Medico [username=" + username + ", password=" + password + ", especialidad=" + especialidad
				+ ", centroSalud=" + centroSalud + ", direccionCentro=" + direccionCentro + ", codigoPostalCentro="
				+ codigoPostalCentro + ", consulta=" + consulta + "]";
	}       
}
