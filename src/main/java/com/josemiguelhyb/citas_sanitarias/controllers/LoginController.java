package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.josemiguelhyb.citas_sanitarias.data.PacienteRepository;
import com.josemiguelhyb.citas_sanitarias.models.Paciente;

import jakarta.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login"; // Muestra login.html
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String username, 
    								@RequestParam String password,
    								RedirectAttributes redirectAttributes,
    								HttpSession session) {
    	
        Paciente paciente = pacienteRepository.findByUsernameAndPassword(username, password);

        if (paciente != null) { // Si el paciente existe
        		session.setAttribute("paciente", paciente); // <- lo guardas en sesión
            return "redirect:/dashboard"; // O a donde tú quieras
        } else {
        		redirectAttributes.addFlashAttribute("error", "Usuario o contraseñas incorrectas");
            return "redirect:/login";
        }
    }
}
