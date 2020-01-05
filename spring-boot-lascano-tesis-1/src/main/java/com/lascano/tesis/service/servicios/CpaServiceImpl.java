package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.cpa;
import com.lascano.tesis.repository.repositorios.CpaRepository;

@Service
public class CpaServiceImpl implements CpaService{

	@Autowired
	CpaRepository repository;
	
	@Override
	public List<cpa> findAll() {
		// TODO Auto-generated method stub
		return (List<cpa>) repository.findAll();
	}

	@Override
	public cpa findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public cpa save(cpa p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
