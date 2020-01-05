package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.cooprd;
import com.lascano.tesis.repository.repositorios.CooprdRepository;

@Service
public class CooprdServiceImpl implements CooprdService{

	@Autowired
	CooprdRepository repository;
	
	@Override
	public List<cooprd> findAll() {
		// TODO Auto-generated method stub
		return (List<cooprd>) repository.findAll();
	}

	@Override
	public cooprd findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public cooprd save(cooprd p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
