package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.josemiguelhyb.citas_sanitarias.data.CitaRepository;
import com.josemiguelhyb.citas_sanitarias.models.Medico;

import jakarta.servlet.http.HttpSession;

@Controller
public class DashboardMedicoController {

    // Inyección de dependencias por constructor
    public DashboardMedicoController(CitaRepository citaRepository) {

    }

    @GetMapping("/medicos/dashboard")
    public String mostrarDashboard(HttpSession session, Model model) {
        // Obtener médico desde la sesión
        Medico medico = (Medico) session.getAttribute("medico");

        if (medico == null) {
            return "redirect:/medicos/login";
        }

        // Añadir médico al modelo
        model.addAttribute("medico", medico);

        // Buscar las próximas citas del médico (si quisieras añadir esto más adelante)
        /*
        List<Cita> citas = citaRepository.findByMedicoIdAndEstadoOrderByFechaHoraAsc(medico.getId(), "PENDIENTE");
        model.addAttribute("citas", citas);
        */

        // Renderizar la vista dashboard-medico.html
        return "dashboard-medico";
    }
}
