package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.seguimientoGraduados;
import com.lascano.tesis.repository.repositorios.SeguimientoGraduadosRepository;

@Service
public class SeguimientoGraduadosServiceImpl implements SeguimientoGraduadosService {

	@Autowired
	SeguimientoGraduadosRepository repository;
	
	@Override
	public List<seguimientoGraduados> findAll() {
		// TODO Auto-generated method stub
		return (List<seguimientoGraduados>) repository.findAll();
	}

	@Override
	public seguimientoGraduados findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public seguimientoGraduados save(seguimientoGraduados p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
