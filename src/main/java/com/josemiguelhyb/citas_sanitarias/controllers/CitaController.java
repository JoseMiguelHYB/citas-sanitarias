package com.josemiguelhyb.citas_sanitarias.controllers;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josemiguelhyb.citas_sanitarias.models.Cita;

@Controller
@RequestMapping("/citas")
public class CitaController {
    private static final List<Cita> citas = Arrays.asList(
        new Cita(1L, LocalDateTime.of(2025, 8, 5, 10, 0), "Revisión general", "pendiente", 1L, 101L),
        new Cita(2L, LocalDateTime.of(2025, 8, 6, 11, 30), "Consulta dermatológica", "confirmada", 2L, 102L),
        new Cita(3L, LocalDateTime.of(2025, 8, 7, 9, 0), "Análisis de sangre", "cancelada", 3L, 103L)
    );

    @GetMapping
    public String getAllCitas(Model model) {
        model.addAttribute("citas", citas);
        return "citas"; // thymeleaf: citas.html
    }
}
