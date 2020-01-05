package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.tid;
import com.lascano.tesis.repository.repositorios.TidRepository;

@Service
public class TidServiceImpl implements TidService{
	
	@Autowired
	TidRepository repository;

	@Override
	public List<tid> findAll() {
		// TODO Auto-generated method stub
		return (List<tid>) repository.findAll();
	}

	@Override
	public tid findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public tid save(tid p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
