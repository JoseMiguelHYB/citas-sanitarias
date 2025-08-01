package com.josemiguelhyb.citas_sanitarias.models;

import java.time.LocalDateTime;

import jakarta.persistence.Id;

public class Cita {
	@Id
	private Long id;
	private LocalDateTime fechaHora;
	private String motivo;
	private String estado; // "pendiente", "confirmada", "cancelada"
	private Long pacienteId; // Clave foreanea
	private Long medicoId; // Clave foranea
	
	public Cita() {
		
	}

	public Cita(Long id, LocalDateTime fechaHora, String motivo, String estado, Long pacienteId, Long medicoId) {
		this.id = id;
		this.fechaHora = fechaHora;
		this.motivo = motivo;
		this.estado = estado;
		this.pacienteId = pacienteId;
		this.medicoId = medicoId;
	}

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

	public Long getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(Long pacienteId) {
		this.pacienteId = pacienteId;
	}

	public Long getMedicoId() {
		return medicoId;
	}

	public void setMedicoId(Long medicoId) {
		this.medicoId = medicoId;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", fechaHora=" + fechaHora + ", motivo=" + motivo + ", estado=" + estado
				+ ", pacienteId=" + pacienteId + ", medicoId=" + medicoId + "]";
	}
}
