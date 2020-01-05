package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.ep;
import com.lascano.tesis.repository.repositorios.EpRepository;

@Service
public class EpServiceImpl implements EpService{

	@Autowired
	EpRepository repository;
	
	@Override
	public List<ep> findAll() {
		// TODO Auto-generated method stub
		return (List<ep>) repository.findAll();
	}

	@Override
	public ep findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ep save(ep p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
