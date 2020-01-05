package com.lascano.tesis.repository.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lascano.tesis.model.entidades.movilidadAcademica;

@Repository
public interface MovilidadAcademicaRepository extends JpaRepository<movilidadAcademica, String>{

}
