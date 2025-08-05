package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.josemiguelhyb.citas_sanitarias.models.Medico;
import com.josemiguelhyb.citas_sanitarias.services.MedicoService;

@Controller
public class MedicoRegistroController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping("/medicos/register")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("medico", new Medico()); // Para el form de register.html
        return "register-medico"; // Nombre del HTML que debes crear
    }

    @PostMapping("/medicos/register")
    public String procesarFormularioRegistro(@ModelAttribute Medico medico, 
    			RedirectAttributes redirectAttributes) {
        try {
            medicoService.registrarMedico(medico);
            redirectAttributes.addFlashAttribute("successMessage", "Médico registrado correctamente");
            return "redirect:/medicos/login-medico";
        } catch (IllegalArgumentException ex) {
            redirectAttributes.addFlashAttribute("error", ex.getMessage());
            return "redirect:/medicos/register-medico";
        }
    }
}
