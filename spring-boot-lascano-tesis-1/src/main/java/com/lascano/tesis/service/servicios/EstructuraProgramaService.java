package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.estructuraPrograma;

public interface EstructuraProgramaService {
	
	public List<estructuraPrograma> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public estructuraPrograma findById(String id);

	public estructuraPrograma save(estructuraPrograma p);

	public void delete(String id);

}
