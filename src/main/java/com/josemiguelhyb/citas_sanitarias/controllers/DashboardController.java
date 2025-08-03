package com.josemiguelhyb.citas_sanitarias.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.josemiguelhyb.citas_sanitarias.data.CitaRepository;
import com.josemiguelhyb.citas_sanitarias.models.Cita;
import com.josemiguelhyb.citas_sanitarias.models.Medico;
import com.josemiguelhyb.citas_sanitarias.models.Paciente;

import jakarta.servlet.http.HttpSession;

@Controller
public class DashboardController {

    private final CitaRepository citaRepository;

    // Inyección de dependencias por constructor
    public DashboardController(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @GetMapping("/dashboard")
    public String mostrarDashboard(HttpSession session, Model model) {
        // Obtener paciente desde la sesión
        Paciente paciente = (Paciente) session.getAttribute("paciente");

        if (paciente == null) {
            return "redirect:/login";
        }

        // Añadir paciente al modelo
        model.addAttribute("paciente", paciente);

        // Buscar la primera cita activa del paciente
        List<Cita> citas = citaRepository.findByPacienteIdAndEstadoOrderByFechaHoraAsc(paciente.getId(), "PENDIENTE");
        Cita cita = citas.isEmpty() ? null : citas.get(0);        
        if (cita != null) {
            model.addAttribute("cita", cita);

            // Obtener el médico asociado a la cita (si no es lazy o ya está cargado)
            Medico medico = cita.getMedico();
            if (medico != null) {
                model.addAttribute("medico", medico);
            }
        }

        // Renderizar la vista dashboard.html
        return "dashboard";
    }
}
