package com.josemiguelhyb.citas_sanitarias.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.josemiguelhyb.citas_sanitarias.data.PacienteRepository;
import com.josemiguelhyb.citas_sanitarias.models.Paciente;

@Service
public class PacienteService {
	private final PacienteRepository personaRepository;
	
	public PacienteService(PacienteRepository personaRepository) {
		this.personaRepository = personaRepository;
	}

	public List<Paciente> getAllPacientes() {
		return personaRepository.findAll();
	}
	
}
