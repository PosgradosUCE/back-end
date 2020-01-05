package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.pv;
import com.lascano.tesis.repository.repositorios.PvRepository;

@Service
public class PvServiceImpl implements PvService{

	@Autowired
	PvRepository repository;
	
	@Override
	public List<pv> findAll() {
		// TODO Auto-generated method stub
		return (List<pv>) repository.findAll();
	}

	@Override
	public pv findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public pv save(pv p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
