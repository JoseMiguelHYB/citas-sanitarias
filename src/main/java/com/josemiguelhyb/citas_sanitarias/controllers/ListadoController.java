package com.josemiguelhyb.citas_sanitarias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.josemiguelhyb.citas_sanitarias.models.Cita;
import com.josemiguelhyb.citas_sanitarias.models.Paciente;
import com.josemiguelhyb.citas_sanitarias.services.CitaService;

@Controller
public class ListadoController {

    @Autowired
    private CitaService citaService;

    @GetMapping("/citas/listado")
    public String verCitasPaciente(Model model, Paciente pacienteAutenticado) {
        List<Cita> citas = citaService.findByPaciente(pacienteAutenticado);
        model.addAttribute("citas", citas);
        model.addAttribute("paciente", pacienteAutenticado);
        return "listado"; // se refiere a listado.html
    }
}