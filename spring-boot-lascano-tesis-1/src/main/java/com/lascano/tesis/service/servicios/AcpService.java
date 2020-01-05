package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.acp;


public interface AcpService {

	public List<acp> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public acp findById(String id);

	public acp save(acp p);

	public void delete(String id);
}
