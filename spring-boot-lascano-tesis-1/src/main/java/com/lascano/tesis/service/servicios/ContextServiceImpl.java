package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.contexto;
import com.lascano.tesis.repository.repositorios.ContextRepository;

@Service
public class ContextServiceImpl implements ContextService{

	@Autowired
	ContextRepository repository;
	
	@Override
	public List<contexto> findAll() {
		// TODO Auto-generated method stub
		return (List<contexto>) repository.findAll();
	}

	@Override
	public contexto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public contexto save(contexto p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
