package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.ep;

public interface EpService {

	public List<ep> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public ep findById(String id);

	public ep save(ep p);

	public void delete(String id);
}
