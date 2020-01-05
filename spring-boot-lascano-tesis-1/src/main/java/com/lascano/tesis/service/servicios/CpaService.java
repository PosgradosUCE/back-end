package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.cpa;

public interface CpaService {

	public List<cpa> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public cpa findById(String id);

	public cpa save(cpa p);

	public void delete(String id);
}
