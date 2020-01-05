package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.gruposInvestigacion;
import com.lascano.tesis.repository.repositorios.GrupoInvestigacionRepository;

@Service
public class GruposInvestigacionServiceImpl implements GruposInvestigacionService{

	@Autowired
	GrupoInvestigacionRepository repository;
	
	@Override
	public List<gruposInvestigacion> findAll() {
		// TODO Auto-generated method stub
		return (List<gruposInvestigacion>) repository.findAll();
	}

	@Override
	public gruposInvestigacion findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public gruposInvestigacion save(gruposInvestigacion p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
