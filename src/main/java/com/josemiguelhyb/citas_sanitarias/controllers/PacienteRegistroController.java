package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.josemiguelhyb.citas_sanitarias.models.Paciente;
import com.josemiguelhyb.citas_sanitarias.services.PacienteService;

@Controller
public class PacienteRegistroController { // CAMBIAR: A a RegisterController.java

	@Autowired
	private PacienteService pacienteService;

	@GetMapping("/pacientes/register")
	public String mostrarFormularioRegistro(Model model) {
		model.addAttribute("paciente", new Paciente());
		return "register-paciente";
	}

	// Autenticaicon Básica sin cifrado ni nada, segutridad plana
	// El PacienteService.java encapusla lógica de negocio relacionada con los
	// pacientes
	// En lugar de que el controlador acceda directamente al repositorio, se
	// recomienda
	// que interactue con el servicio. proporciona separación de responsabilidades,
	// pruebas practicas
	@PostMapping("/pacientes/register")
	public String procesarFormularioRegistro(@ModelAttribute Paciente paciente,
			RedirectAttributes redirectAttributes) {
		try {
			pacienteService.registrarPaciente(paciente);
			redirectAttributes.addFlashAttribute("successMessage", "Paciente registrado correctamente");
			return "redirect:/pacientes/login-paciente"; // también puedes ajustar esto si usas esa ruta
		} catch (IllegalArgumentException ex) {
			redirectAttributes.addFlashAttribute("error", ex.getMessage());
			return "redirect:/pacientes/register-paciente";
		}
	}
	
}