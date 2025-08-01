package com.josemiguelhyb.citas_sanitarias.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.josemiguelhyb.citas_sanitarias.controllers.PacienteController;
import com.josemiguelhyb.citas_sanitarias.data.MedicoRepository;
import com.josemiguelhyb.citas_sanitarias.models.Medico;

@Service
public class MedicoService {
	private final MedicoRepository medicoRepository;
	 	 	 
	public MedicoService(MedicoRepository medicoRepository, PacienteController pacienteController) {
		this.medicoRepository = medicoRepository;
	}

	public List<Medico> getAllMedicos() {
		return medicoRepository.findAll();
	}
}
