// Aplicación REST

package com.josemiguelhyb.citas_sanitarias.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josemiguelhyb.citas_sanitarias.models.Paciente;
import com.josemiguelhyb.citas_sanitarias.services.PacienteService;

@RestController
@RequestMapping("api/pacientes")
public class PacienteRestController {
	
	private PacienteService pacienteService;

	public PacienteRestController(PacienteService pacienteService) {
		this.pacienteService = pacienteService;
	}
	
	@GetMapping
	public List<Paciente> getAllPacientes() {
		return pacienteService.getAllPacientes();
		
	}
}
