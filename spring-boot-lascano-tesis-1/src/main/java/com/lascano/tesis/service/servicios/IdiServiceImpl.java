package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.idi;
import com.lascano.tesis.repository.repositorios.IdiRepository;

@Service
public class IdiServiceImpl implements IdiService{

	@Autowired
	IdiRepository repository;
	
	@Override
	public List<idi> findAll() {
		// TODO Auto-generated method stub
		return (List<idi>) repository.findAll();
	}

	@Override
	public idi findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public idi save(idi p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
