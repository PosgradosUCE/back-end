package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.movilidadAcademica;
import com.lascano.tesis.repository.repositorios.MovilidadAcademicaRepository;

@Service
public class MovilidadAcademicaServiceImpl implements MovilidadAcademicaService {

	@Autowired
	MovilidadAcademicaRepository repository;
	
	@Override
	public List<movilidadAcademica> findAll() {
		// TODO Auto-generated method stub
		return (List<movilidadAcademica>) repository.findAll();
	}

	@Override
	public movilidadAcademica findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public movilidadAcademica save(movilidadAcademica p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
