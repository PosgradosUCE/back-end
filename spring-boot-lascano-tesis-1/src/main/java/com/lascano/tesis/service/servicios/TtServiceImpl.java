package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.tt;
import com.lascano.tesis.repository.repositorios.TtRepository;

@Service
public class TtServiceImpl implements TtService{

	@Autowired
	TtRepository repository;
	
	@Override
	public List<tt> findAll() {
		// TODO Auto-generated method stub
		return (List<tt>) repository.findAll();
	}

	@Override
	public tt findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public tt save(tt p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
