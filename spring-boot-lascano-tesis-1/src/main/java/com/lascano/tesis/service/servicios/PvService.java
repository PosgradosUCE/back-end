package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.pv;

public interface PvService {
	
	public List<pv> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public pv findById(String id);

	public pv save(pv p);

	public void delete(String id);

}
