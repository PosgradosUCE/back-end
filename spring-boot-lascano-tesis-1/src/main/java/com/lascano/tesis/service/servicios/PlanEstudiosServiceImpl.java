package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.planEstudios;
import com.lascano.tesis.repository.repositorios.PlanEstudiosRepository;

@Service
public class PlanEstudiosServiceImpl implements PlanEstudiosService {

	@Autowired
	PlanEstudiosRepository repository;
	
	@Override
	public List<planEstudios> findAll() {
		// TODO Auto-generated method stub
		return (List<planEstudios>) repository.findAll();
	}

	@Override
	public planEstudios findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public planEstudios save(planEstudios p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
