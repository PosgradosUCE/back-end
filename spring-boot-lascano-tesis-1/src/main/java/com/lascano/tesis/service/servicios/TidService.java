package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.tid;

public interface TidService {

	public List<tid> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public tid findById(String id);

	public tid save(tid p);

	public void delete(String id);
}
