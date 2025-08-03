package com.josemiguelhyb.citas_sanitarias.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josemiguelhyb.citas_sanitarias.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    Paciente findByDniAndCodigoIdentificacion(String dni, String codigoIdentificacion);
    Paciente findByDni(String dni);
    boolean existsByDni(String dni);
    boolean existsByUsername(String username);
    Paciente findByUsernameAndPassword(String username, String password);

}
