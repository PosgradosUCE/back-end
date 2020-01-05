package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.planMicrocurricular;
import com.lascano.tesis.repository.repositorios.PlanMicrocurricularRepository;

@Service
public class PlanMicrocurricularServiceImpl implements PlanMicrocurricularService{

	@Autowired
	PlanMicrocurricularRepository repository;
	
	@Override
	public List<planMicrocurricular> findAll() {
		// TODO Auto-generated method stub
		return (List<planMicrocurricular>) repository.findAll();
	}

	@Override
	public planMicrocurricular findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public planMicrocurricular save(planMicrocurricular p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
