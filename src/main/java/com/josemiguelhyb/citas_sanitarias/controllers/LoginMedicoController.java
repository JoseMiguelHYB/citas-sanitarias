package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.josemiguelhyb.citas_sanitarias.models.Medico;
import com.josemiguelhyb.citas_sanitarias.services.MedicoService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginMedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping("/medicos/login")
    public String mostrarFormularioLogin() {
        return "login-medico"; // Nombre de tu plantilla .html para login de médicos
    }

    @PostMapping("/medicos/login")
    public String procesarLogin(@RequestParam String username,
                                 @RequestParam String password,
                                 RedirectAttributes redirectAttributes,
                                 HttpSession session) {

        Medico medico = medicoService.validarCredenciales(username, password);

        if (medico != null) {
            session.setAttribute("medico", medico);
            return "redirect:/medicos/dashboard";
        } else {
            redirectAttributes.addFlashAttribute("error", "Usuario o contraseña incorrectos");
            return "redirect:/medicos/login-medico";
        }
    }
}
