package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.estructuraPrograma;
import com.lascano.tesis.repository.repositorios.EstructuraProgramaRepository;

@Service
public class EstructuraProgramaServiceImpl implements EstructuraProgramaService{

	@Autowired
	EstructuraProgramaRepository repository;
	
	@Override
	public List<estructuraPrograma> findAll() {
		// TODO Auto-generated method stub
		return (List<estructuraPrograma>) repository.findAll();
	}

	@Override
	public estructuraPrograma findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public estructuraPrograma save(estructuraPrograma p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
