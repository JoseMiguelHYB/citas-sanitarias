package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josemiguelhyb.citas_sanitarias.services.CitaService;

@Controller
@RequestMapping("/citas")
public class CitaController {
	@Autowired
	private CitaService citaService;
	

    @GetMapping
    public String getAllCitas(Model model) {
        model.addAttribute("citas", citaService.getAllCitas());
        return "citas"; // thymeleaf: citas.html
    }
    
    
}
