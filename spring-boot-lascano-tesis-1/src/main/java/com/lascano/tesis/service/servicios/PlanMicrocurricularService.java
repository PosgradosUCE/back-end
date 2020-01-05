package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.planMicrocurricular;

public interface PlanMicrocurricularService {

	public List<planMicrocurricular> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public planMicrocurricular findById(String id);

	public planMicrocurricular save(planMicrocurricular p);

	public void delete(String id);
	
}
