package com.josemiguelhyb.citas_sanitarias.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josemiguelhyb.citas_sanitarias.models.Cita;

public interface CitaRepository extends JpaRepository<Cita, Long>{

}
