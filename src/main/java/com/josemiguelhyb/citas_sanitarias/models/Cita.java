package com.josemiguelhyb.citas_sanitarias.models;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime fechaHora;

    @Column(nullable = false)
    private String motivo;

    @Column(nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @Column(name = "tipo_consulta")
    private String tipoConsulta; // Presencial/telefónica/Online

    @Column
    private String ubicacion; // Si cambia el centro

    @Column
    private String observaciones;

    @Column(name = "creada_en")
    private LocalDateTime creadaEn;

    @Column(name = "modificada_en")
    private LocalDateTime modificadaEn;

    @Column(name = "duracion_minutos")
    private Integer duracionMinutos;

    // Constructor vacío
    public Cita() {}

    // Constructor con todos los campos (excepto ID autogenerado)
    public Cita(LocalDateTime fechaHora, String motivo, String estado, Paciente paciente, Medico medico,
                String tipoConsulta, String ubicacion, String observaciones,
                LocalDateTime creadaEn, LocalDateTime modificadaEn, Integer duracionMinutos) {
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
        this.tipoConsulta = tipoConsulta;
        this.ubicacion = ubicacion;
        this.observaciones = observaciones;
        this.creadaEn = creadaEn;
        this.modificadaEn = modificadaEn;
        this.duracionMinutos = duracionMinutos;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDateTime getCreadaEn() {
        return creadaEn;
    }

    public void setCreadaEn(LocalDateTime creadaEn) {
        this.creadaEn = creadaEn;
    }

    public LocalDateTime getModificadaEn() {
        return modificadaEn;
    }

    public void setModificadaEn(LocalDateTime modificadaEn) {
        this.modificadaEn = modificadaEn;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id=" + id +
                ", fechaHora=" + fechaHora +
                ", motivo='" + motivo + '\'' +
                ", estado='" + estado + '\'' +
                ", paciente=" + paciente +
                ", medico=" + medico +
                ", tipoConsulta='" + tipoConsulta + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", creadaEn=" + creadaEn +
                ", modificadaEn=" + modificadaEn +
                ", duracionMinutos=" + duracionMinutos +
                '}';
    }
}
