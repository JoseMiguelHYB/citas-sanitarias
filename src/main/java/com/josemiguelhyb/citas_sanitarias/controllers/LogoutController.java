package com.josemiguelhyb.citas_sanitarias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class LogoutController {

	@PostMapping("/logout")
	public String cerrarSesion(HttpSession session) {
	    session.invalidate(); // Cierra la sesión
	    return "redirect:/login";
	}
}
