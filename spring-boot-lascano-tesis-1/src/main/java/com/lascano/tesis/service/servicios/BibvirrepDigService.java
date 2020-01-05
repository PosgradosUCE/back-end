package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.bibvirrepDig;


public interface BibvirrepDigService {

	public List<bibvirrepDig> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public bibvirrepDig findById(String id);

	public bibvirrepDig save(bibvirrepDig p);

	public void delete(String id);
	
}


