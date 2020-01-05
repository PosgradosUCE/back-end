package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.evaluacionSeguimiento;

public interface EvaluacionSeguimientoService {
	
	public List<evaluacionSeguimiento> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public evaluacionSeguimiento findById(String id);

	public evaluacionSeguimiento save(evaluacionSeguimiento p);

	public void delete(String id);

}
