package com.josemiguelhyb.citas_sanitarias.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josemiguelhyb.citas_sanitarias.models.Medico;

@Controller
@RequestMapping("/medicos")
public class MedicoController {
	 private static final List<Medico> medicos = Arrays.asList(
		        new Medico(101L, "Dr. Antonio Pérez", "Cardiología"),
		        new Medico(102L, "Dra. Marta Ruiz", "Dermatología"),
		        new Medico(103L, "Dr. Luis Gómez", "Medicina General"),
		        new Medico(104L, "Dra. Laura Sánchez", "Pediatría")
	);
	
	 @GetMapping
	 public String getAllMedicos(Model model) {
		 model.addAttribute("medicos", medicos);
		 return "medicos"; // Thymeleaf: medicos.html
	 }
}
