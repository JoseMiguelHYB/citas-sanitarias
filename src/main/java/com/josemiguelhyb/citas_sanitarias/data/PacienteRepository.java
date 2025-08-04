package com.josemiguelhyb.citas_sanitarias.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josemiguelhyb.citas_sanitarias.models.Paciente;

// Esto hace la mágia, te da automáticamente los métodos CRUD sin que tú lo implementes
// save(Paciente p), findById(Long id), findAll(), deleteById(Long id),...

// PacienteRepository es solo la "puerta" para acceder a la base de datos
// relacionada con Paciente, usando métodos JPA como: save(paciente), existsByDni(...), findByDni(),...
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    Paciente findByDniAndCodigoIdentificacion(String dni, String codigoIdentificacion);
    Paciente findByDni(String dni);
    boolean existsByDni(String dni);
    boolean existsByUsername(String username);
    Paciente findByUsernameAndPassword(String username, String password); // Dar paso al sistema

}
