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
public class LoginController {

    @Autowired
    private PacienteService pacienteService; // Opción de crear constructor también esta allí

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login"; // Muestra login.html
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String username, 
    								@RequestParam String password,
    								RedirectAttributes redirectAttributes,
    								HttpSession session) {
    	
        Paciente paciente = pacienteService.validarCredenciales(username, password);

        if (paciente != null) { // Si el paciente existe lo mete en una sesión
        		session.setAttribute("paciente", paciente); // <- lo guardas en sesión
            return "redirect:/dashboard"; // O a donde tú quieras
        } else {
        		redirectAttributes.addFlashAttribute("error", "Usuario o contraseñas incorrectas");
            return "redirect:/login";
        }
    }
}
