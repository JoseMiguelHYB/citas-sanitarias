package com.josemiguelhyb.citas_sanitarias.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josemiguelhyb.citas_sanitarias.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
