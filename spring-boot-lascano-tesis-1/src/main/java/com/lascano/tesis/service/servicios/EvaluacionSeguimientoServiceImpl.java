package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.evaluacionSeguimiento;
import com.lascano.tesis.repository.repositorios.EvaluacionSeguimientoRepository;

@Service
public class EvaluacionSeguimientoServiceImpl implements EvaluacionSeguimientoService{

	@Autowired
	EvaluacionSeguimientoRepository repository;
	
	@Override
	public List<evaluacionSeguimiento> findAll() {
		// TODO Auto-generated method stub
		return (List<evaluacionSeguimiento>) repository.findAll();
	}

	@Override
	public evaluacionSeguimiento findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public evaluacionSeguimiento save(evaluacionSeguimiento p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
