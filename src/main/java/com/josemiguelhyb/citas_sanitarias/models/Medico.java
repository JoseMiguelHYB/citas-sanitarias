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

	public Medico(String especialidad, String centroSalud, String direccionCentro, String codigoPostalCentro,
			String consulta) {
		super();
		this.especialidad = especialidad;
		this.centroSalud = centroSalud;
		this.direccionCentro = direccionCentro;
		this.codigoPostalCentro = codigoPostalCentro;
		this.consulta = consulta;
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

	@Override
	public String toString() {
		return "Medico [especialidad=" + especialidad + ", centroSalud=" + centroSalud + ", direccionCentro="
				+ direccionCentro + ", codigoPostalCentro=" + codigoPostalCentro + ", consulta=" + consulta + "]";
	}  
}
