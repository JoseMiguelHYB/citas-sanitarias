package com.josemiguelhyb.citas_sanitarias.controllers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josemiguelhyb.citas_sanitarias.models.Paciente;

@Controller
@RequestMapping("/pacientes") 
public class PacienteController {
	private static final List<Paciente> pacientes = Arrays.asList(
			new Paciente(1L, "001", LocalDate.of(1990, 1, 15), "12345678A"),
			new Paciente(2L, "002", LocalDate.of(1985, 6, 24), "23456789B"),
			new Paciente(3L, "003", LocalDate.of(2000, 3, 10), "34567890C"),
			new Paciente(4L, "004", LocalDate.of(1975, 12, 1), "45678901D"),
			new Paciente(5L, "005", LocalDate.of(1995, 9, 30), "56789012E")		
	);
	
	
	@GetMapping
	public String getAllPersonas(Model model) {
		model.addAttribute("pacientes", pacientes); // Se añade la lista al Model, para que la vista pueda acceder a ${pacientes}
		return "pacientes"; // Nombre de la plantilla de thymeleaf
	}		
}
