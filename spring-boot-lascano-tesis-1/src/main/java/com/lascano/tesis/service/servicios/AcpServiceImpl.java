package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.acp;
import com.lascano.tesis.repository.repositorios.AcpRepository;

@Service
public class AcpServiceImpl implements AcpService{
	
	@Autowired
	AcpRepository repository;

	@Override
	public List<acp> findAll() {
		// TODO Auto-generated method stub
		return (List<acp>)repository.findAll();
	}

	@Override
	public acp findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public acp save(acp p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
