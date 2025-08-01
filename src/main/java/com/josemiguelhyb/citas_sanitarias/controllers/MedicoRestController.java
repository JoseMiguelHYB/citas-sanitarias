// Aplicación REST

package com.josemiguelhyb.citas_sanitarias.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josemiguelhyb.citas_sanitarias.models.Medico;
import com.josemiguelhyb.citas_sanitarias.services.MedicoService;

@RestController
@RequestMapping("api/medicos")
public class MedicoRestController {
	private MedicoService medicoService;

	public MedicoRestController(MedicoService medicoService) {
		this.medicoService = medicoService;
	}
	
	@GetMapping
	public List<Medico> getAllMedicos() {
		return medicoService.getAllMedicos();
	}
}
