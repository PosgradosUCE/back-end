package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.perfilEgreso;
import com.lascano.tesis.repository.repositorios.PerfilEgresoRepository;

@Service
public class PerfilEgresoServiceImpl implements PerfilEgresoService{

	@Autowired
	PerfilEgresoRepository repository;

	@Override
	public List<perfilEgreso> findAll() {
		// TODO Auto-generated method stub
		return (List<perfilEgreso>) repository.findAll();
	}

	@Override
	public perfilEgreso findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public perfilEgreso save(perfilEgreso p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}


}
