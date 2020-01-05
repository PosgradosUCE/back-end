package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.gestioAcademica;
import com.lascano.tesis.repository.repositorios.GestionAcademicaRepository;

@Service
public class gestionAcademicaServiceImpl implements gestionAcademicaService {

	@Autowired
	GestionAcademicaRepository repository;
	
	@Override
	public List<gestioAcademica> findAll() {
		// TODO Auto-generated method stub
		return (List<gestioAcademica>) repository.findAll();
	}

	@Override
	public gestioAcademica findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public gestioAcademica save(gestioAcademica p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
