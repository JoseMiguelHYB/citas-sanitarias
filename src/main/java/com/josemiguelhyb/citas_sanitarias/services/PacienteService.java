package com.josemiguelhyb.citas_sanitarias.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.josemiguelhyb.citas_sanitarias.data.PacienteRepository;
import com.josemiguelhyb.citas_sanitarias.models.Paciente;

@Service
public class PacienteService {
	private final PacienteRepository pacienteRepository; // Es necesario uan isntancia de la ionterfaz a
															// pacienteRepository

	public PacienteService(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}

	public List<Paciente> getAllPacientes() {
		return pacienteRepository.findAll(); // El findALl() ya lo implementa spring boot
	}

	public void registrarPaciente(Paciente paciente) {
		if (pacienteRepository.existsByUsername(paciente.getUsername())) {
			throw new IllegalArgumentException("ERROR: El nombre de usuario ya está registrado");
		}

		if (pacienteRepository.existsByDni(paciente.getDni())) {
			throw new IllegalArgumentException("ERROR: El DNI ya está registrado");
		}

		pacienteRepository.save(paciente); 
	}

}
