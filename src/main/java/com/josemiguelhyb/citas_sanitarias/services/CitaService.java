package com.josemiguelhyb.citas_sanitarias.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.josemiguelhyb.citas_sanitarias.data.CitaRepository;
import com.josemiguelhyb.citas_sanitarias.models.Cita;
import com.josemiguelhyb.citas_sanitarias.models.Paciente;

@Service
public class CitaService {
	private final CitaRepository citaRepository;

	public CitaService(CitaRepository citaRepository) {
		super();
		this.citaRepository = citaRepository;
	}

	public List<Cita> getAllCitas() {
		return citaRepository.findAll();
	}

	public List<Cita> findByPaciente(Paciente pacienteAutenticado) {
		return citaRepository.findByPaciente(pacienteAutenticado);
	}

	public void guardarCita(Cita cita) {
		citaRepository.save(cita);
	}

}
