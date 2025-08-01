package com.josemiguelhyb.citas_sanitarias.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josemiguelhyb.citas_sanitarias.models.Cita;
import com.josemiguelhyb.citas_sanitarias.services.CitaService;

@RestController
@RequestMapping("api/citas")
public class CitaRestController {
	private CitaService citaService;

	public CitaRestController(CitaService citaService) {
		this.citaService = citaService;
	}
	
	@GetMapping
	public List<Cita> getAllCitas() {
		return citaService.getAllCitas();
	}
}
