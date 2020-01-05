package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.contexto;


public interface ContextService {

	public List<contexto> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public contexto findById(String id);

	public contexto save(contexto p);

	public void delete(String id);
	
}
