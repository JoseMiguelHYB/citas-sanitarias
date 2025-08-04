package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josemiguelhyb.citas_sanitarias.models.Cita;
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

    @GetMapping("/nueva")
    public String mostrarFormularioNuevaCita(Model model) {
        model.addAttribute("cita", new Cita());
        return "formulario-cita"; // thymeleaf: formulario-cita.html
    }

    @PostMapping("/guardar")
    public String guardarCita(@ModelAttribute("cita") Cita cita) {
        citaService.guardarCita(cita);
        return "redirect:/dashboard";
    }
}
