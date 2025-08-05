package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josemiguelhyb.citas_sanitarias.services.MedicoService;

@Controller
@RequestMapping("/medicos")
public class MedicoController {
	@Autowired
	private MedicoService medicoService;
	
	 @GetMapping
	 public String getAllMedicos(Model model) {
		 model.addAttribute("medicos", medicoService.getAllMedicos());  
		 return "medicos"; // Thymeleaf: medicos.html
	 }
}
