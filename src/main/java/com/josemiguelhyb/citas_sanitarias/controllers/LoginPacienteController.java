package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.josemiguelhyb.citas_sanitarias.models.Paciente;
import com.josemiguelhyb.citas_sanitarias.services.PacienteService;

import jakarta.servlet.http.HttpSession;


@Controller
public class LoginPacienteController {

    @Autowired
    private PacienteService pacienteService; // Opción de crear constructor también esta allí

    @GetMapping("/pacientes/login")
    public String mostrarFormularioLogin() {
        return "login-paciente";
    }

    @PostMapping("/pacientes/login")
    public String procesarLogin(@RequestParam String username, 
                                @RequestParam String password,
                                RedirectAttributes redirectAttributes,
                                HttpSession session) {
        
        Paciente paciente = pacienteService.validarCredenciales(username, password);

        if (paciente != null) {
            session.setAttribute("paciente", paciente);
            return "redirect:/pacientes/dashboard"; // ajusta si tienes vista propia
        } else {
            redirectAttributes.addFlashAttribute("error", "Usuario o contraseña incorrectos");
            return "redirect:/pacientes/login-paciente";
        }
    }
}
