// Aplicación web
package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josemiguelhyb.citas_sanitarias.services.PacienteService;

@Controller
@RequestMapping("/pacientes") 
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;	
	
	@GetMapping
	public String getAllPersonas(Model model) {
		model.addAttribute("pacientes", pacienteService.getAllPacientes()); // Se añade la lista al Model, para que la vista pueda acceder a ${pacientes}
		return "pacientes"; // Nombre de la plantilla de thymeleaf
	}		
}
