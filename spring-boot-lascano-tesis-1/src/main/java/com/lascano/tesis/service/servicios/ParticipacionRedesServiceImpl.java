package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.participacionRedes;
import com.lascano.tesis.repository.repositorios.ParticipacionRedesRepository;

@Service
public class ParticipacionRedesServiceImpl implements ParticipacionRedesService {

	@Autowired
	ParticipacionRedesRepository repository;
	
	@Override
	public List<participacionRedes> findAll() {
		// TODO Auto-generated method stub
		return (List<participacionRedes>) repository.findAll();
	}

	@Override
	public participacionRedes findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public participacionRedes save(participacionRedes p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
