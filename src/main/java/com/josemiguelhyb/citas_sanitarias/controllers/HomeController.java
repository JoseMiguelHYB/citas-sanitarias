package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // index.html principal
    }

    @GetMapping("/portal/paciente")
    public String portalPaciente() {
        return "index-paciente"; // página para pacientes
    }

    @GetMapping("/portal/medico")
    public String portalMedico() {
        return "index-medico"; // página para médicos
    }
}
