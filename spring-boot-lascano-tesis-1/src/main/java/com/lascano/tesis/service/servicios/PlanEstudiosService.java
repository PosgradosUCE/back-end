package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.planEstudios;

public interface PlanEstudiosService {

	
	public List<planEstudios> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public planEstudios findById(String id);

	public planEstudios save(planEstudios p);

	public void delete(String id);
	
}
