package com.josemiguelhyb.citas_sanitarias.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josemiguelhyb.citas_sanitarias.models.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    // Spring Data JPA implementa esto automáticamente
    Medico findByUsername(String username);
}