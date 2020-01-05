package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.bibvirrepDig;
import com.lascano.tesis.repository.repositorios.BibvirrepDigRepository;

@Service
public class BibvirrepDigServiceImpl implements BibvirrepDigService{

	@Autowired
	BibvirrepDigRepository repository;
	
	@Override
	public List<bibvirrepDig> findAll() {
		// TODO Auto-generated method stub
		return (List<bibvirrepDig>) repository.findAll();
	}

	@Override
	public bibvirrepDig findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public bibvirrepDig save(bibvirrepDig p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
