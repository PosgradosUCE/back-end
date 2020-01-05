package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.iaa;
import com.lascano.tesis.repository.repositorios.IaaRepository;

@Service
public class IaaServiceImpl implements IaaService {

	@Autowired
	IaaRepository repository;
	
	@Override
	public List<iaa> findAll() {
		// TODO Auto-generated method stub
		return (List<iaa>)repository.findAll();
	}

	@Override
	public iaa findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public iaa save(iaa p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
