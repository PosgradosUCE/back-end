package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.politicasTitulacion;
import com.lascano.tesis.repository.repositorios.PoliticasTitulacionRepository;

@Service
public class PoliticasTitulacionServiceImpl implements PoliticasTitulacionService{

	@Autowired
	PoliticasTitulacionRepository repository;
	
	@Override
	public List<politicasTitulacion> findAll() {
		// TODO Auto-generated method stub
		return (List<politicasTitulacion>) repository.findAll();
	}

	@Override
	public politicasTitulacion findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public politicasTitulacion save(politicasTitulacion p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
