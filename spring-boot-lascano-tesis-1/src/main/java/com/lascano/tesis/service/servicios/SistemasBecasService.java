package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.sistemasBecas;

public interface SistemasBecasService {

	public List<sistemasBecas> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public sistemasBecas findById(String id);

	public sistemasBecas save(sistemasBecas p);

	public void delete(String id);
	
}
