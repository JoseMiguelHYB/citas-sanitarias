package com.josemiguelhyb.citas_sanitarias.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josemiguelhyb.citas_sanitarias.data.MedicoRepository;
import com.josemiguelhyb.citas_sanitarias.models.Medico;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public void registrarMedico(Medico medico) {
        // Validación simple: no permitir usuarios duplicados
        if (medicoRepository.findByUsername(medico.getUsername()) != null) {
            throw new IllegalArgumentException("El nombre de usuario ya está en uso.");
        }

        // Si quieres agregar hash de contraseña, este es el lugar
        // medico.setPassword(BCrypt.hashpw(medico.getPassword(), BCrypt.gensalt()));

        medicoRepository.save(medico);
    }

    public Medico validarCredenciales(String username, String password) {
        Medico medico = medicoRepository.findByUsername(username);

        if (medico != null && medico.getPassword().equals(password)) {
            return medico;
        }

        return null;
    }
    
    // Obtener todos los médicos
    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }
}
