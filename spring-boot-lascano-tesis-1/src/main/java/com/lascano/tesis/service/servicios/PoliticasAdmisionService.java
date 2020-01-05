package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.politicasAdmision;

public interface PoliticasAdmisionService {

	public List<politicasAdmision> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public politicasAdmision findById(String id);

	public politicasAdmision save(politicasAdmision p);

	public void delete(String id);
}
