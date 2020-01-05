package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.afp;

public interface AfpService {

	public List<afp> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public afp findById(String id);

	public afp save(afp p);

	public void delete(String id);
}
