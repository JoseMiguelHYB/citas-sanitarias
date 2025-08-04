package com.josemiguelhyb.citas_sanitarias.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "passwd", nullable = false)
    private String password;

    @Column(name = "codigo_identificacion")
    private String codigoIdentificacion;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    private String direccion;

    private String localidad;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    private String genero;

    @Column(name = "numero_seguridad_social")
    private String numeroSeguridadSocial;

    private Boolean activo;

    public Paciente() {}

    public Paciente(Long id, String username, String password, String codigoIdentificacion, LocalDate fechaNacimiento,
                    String dni, String nombre, String apellido, String telefono, String email,
                    String direccion, String localidad, String codigoPostal, String genero,
                    String numeroSeguridadSocial, Boolean activo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.codigoIdentificacion = codigoIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
        this.genero = genero;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.activo = activo;
    }

    // Getters y Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getCodigoIdentificacion() { return codigoIdentificacion; }
    public void setCodigoIdentificacion(String codigoIdentificacion) { this.codigoIdentificacion = codigoIdentificacion; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    public String getCodigoPostal() { return codigoPostal; }
    public void setCodigoPostal(String codigoPostal) { this.codigoPostal = codigoPostal; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getNumeroSeguridadSocial() { return numeroSeguridadSocial; }
    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) { this.numeroSeguridadSocial = numeroSeguridadSocial; }

    public Boolean getActivo() { return activo; }
    public void setActivo(Boolean activo) { this.activo = activo; }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", codigoIdentificacion='" + codigoIdentificacion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", genero='" + genero + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", activo=" + activo +
                '}';
    }
}
