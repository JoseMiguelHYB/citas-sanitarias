package com.josemiguelhyb.citas_sanitarias.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    	@Column(name = "especialidad")
    	private String especialidad;

    	@Column
    private String email;
    
    private String telefono;

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

	public Medico(Long id, String nombre, String apellido, String especialidad, String email, String telefono,
			String centroSalud, String direccionCentro, String codigoPostalCentro, String consulta) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.email = email;
		this.telefono = telefono;
		this.centroSalud = centroSalud;
		this.direccionCentro = direccionCentro;
		this.codigoPostalCentro = codigoPostalCentro;
		this.consulta = consulta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
		return "Medico [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad
				+ ", email=" + email + ", telefono=" + telefono + ", centroSalud=" + centroSalud + ", direccionCentro="
				+ direccionCentro + ", codigoPostalCentro=" + codigoPostalCentro + ", consulta=" + consulta + "]";
	}       
   
}
