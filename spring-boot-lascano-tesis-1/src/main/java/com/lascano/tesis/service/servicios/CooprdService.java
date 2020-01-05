package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.cooprd;


public interface CooprdService {
	
	public List<cooprd> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public cooprd findById(String id);

	public cooprd save(cooprd p);

	public void delete(String id);

}
