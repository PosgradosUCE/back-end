package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.tt;


public interface TtService {
	
	public List<tt> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public tt findById(String id);

	public tt save(tt p);

	public void delete(String id);

}
