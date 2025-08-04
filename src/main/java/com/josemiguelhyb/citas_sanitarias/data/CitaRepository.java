package com.josemiguelhyb.citas_sanitarias.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josemiguelhyb.citas_sanitarias.models.Cita;
import com.josemiguelhyb.citas_sanitarias.models.Paciente;

public interface CitaRepository extends JpaRepository<Cita, Long> {
    
    // Devuelve todas las citas activas de un paciente, ordenadas por fecha
	List<Cita> findByPacienteIdAndEstadoOrderByFechaHoraAsc(Long pacienteId, String estado);
	
    List<Cita> findByPaciente(Paciente paciente);

}