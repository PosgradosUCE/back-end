package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.sistemasBecas;
import com.lascano.tesis.repository.repositorios.SistemasBecasRepository;

@Service
public class SistemasBecasServiceImpl implements SistemasBecasService {

	@Autowired
	SistemasBecasRepository repository;
	
	@Override
	public List<sistemasBecas> findAll() {
		// TODO Auto-generated method stub
		return (List<sistemasBecas>) repository.findAll();
	}

	@Override
	public sistemasBecas findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public sistemasBecas save(sistemasBecas p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
