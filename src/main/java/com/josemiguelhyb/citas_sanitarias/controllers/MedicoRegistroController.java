package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String procesarFormularioRegistro(@ModelAttribute Medico medico, Model model) {
        try {
            medicoService.registrarMedico(medico);
            model.addAttribute("successMessage", "Médico registrado correctamente");
            return "login-medico";
        } catch (IllegalArgumentException ex) {
        		model.addAttribute("error", ex.getMessage());
            return "register-medico";
        }
    }
}
