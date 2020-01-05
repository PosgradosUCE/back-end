package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.idi;


public interface IdiService {

	public List<idi> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public idi findById(String id);

	public idi save(idi p);

	public void delete(String id);
	
}
