package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.josemiguelhyb.citas_sanitarias.data.PacienteRepository;
import com.josemiguelhyb.citas_sanitarias.models.Paciente;

@Controller
public class RegistroController { // CAMBIAR: A a RegisterController.java

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/register")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("paciente", new Paciente()); // Es necesario proqeuq register.html necesita un objeto aunque sea vacio
        return "register"; // Nos lleva a register.html
    }

    // Autenticaicon Básica sin cifrado ni nada, segutridad plana
    @PostMapping("/register")
    public String procesarFormularioRegistro(@ModelAttribute Paciente paciente,
                                             RedirectAttributes redirectAttributes) {
        
    		if (pacienteRepository.existsByUsername(paciente.getUsername())) {
            redirectAttributes.addFlashAttribute("error", "ERROR: El nombre de usuario ya está registrado");
            return "redirect:/register";
        }
    	
    	
    		// Validar antes de guardar
    		if(pacienteRepository.existsByDni(paciente.getDni())) {
    	        redirectAttributes.addFlashAttribute("error", "ERROR: El nombre de usuario ya está registrado");
    	        return "redirect:/register"; // Redirige al register.html
    		}
    		
    		
    		
    	
    		pacienteRepository.save(paciente); // Guarda en la base de datos
        redirectAttributes.addFlashAttribute("successMessage", "Paciente registrado correctamente");
        return "redirect:/login";  // Redirige al login.html
    }
}