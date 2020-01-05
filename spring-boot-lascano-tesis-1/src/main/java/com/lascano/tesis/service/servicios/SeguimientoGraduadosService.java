package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.seguimientoGraduados;

public interface SeguimientoGraduadosService {

	public List<seguimientoGraduados> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public seguimientoGraduados findById(String id);

	public seguimientoGraduados save(seguimientoGraduados p);

	public void delete(String id);
	
}
