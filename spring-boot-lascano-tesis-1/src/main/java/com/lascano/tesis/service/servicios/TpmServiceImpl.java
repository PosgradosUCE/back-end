package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.tpm;
import com.lascano.tesis.repository.repositorios.TpmRepository;

@Service
public class TpmServiceImpl implements TpmService{

	@Autowired
	TpmRepository repository;
	
	@Override
	public List<tpm> findAll() {
		// TODO Auto-generated method stub
		return (List<tpm>) repository.findAll();
	}

	@Override
	public tpm findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public tpm save(tpm p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
