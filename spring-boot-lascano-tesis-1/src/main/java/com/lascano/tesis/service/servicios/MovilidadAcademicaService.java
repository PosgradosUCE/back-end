package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.movilidadAcademica;

public interface MovilidadAcademicaService {

	public List<movilidadAcademica> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public movilidadAcademica findById(String id);

	public movilidadAcademica save(movilidadAcademica p);

	public void delete(String id);
	
}
