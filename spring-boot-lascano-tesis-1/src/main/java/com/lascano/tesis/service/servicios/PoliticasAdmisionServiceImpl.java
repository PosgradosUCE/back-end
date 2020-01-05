package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.politicasAdmision;
import com.lascano.tesis.repository.repositorios.PoliticasAdmisionRepository;

@Service
public class PoliticasAdmisionServiceImpl implements PoliticasAdmisionService {

	@Autowired
	PoliticasAdmisionRepository repository;
	
	@Override
	public List<politicasAdmision> findAll() {
		// TODO Auto-generated method stub
		return (List<politicasAdmision>) repository.findAll();
	}

	@Override
	public politicasAdmision findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public politicasAdmision save(politicasAdmision p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
