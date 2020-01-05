package com.lascano.tesis.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lascano.tesis.model.entidades.afp;
import com.lascano.tesis.repository.repositorios.AfpRepository;

@Service
public class AfpServiceImpl implements AfpService {

	@Autowired
	AfpRepository repository;

	@Override
	public List<afp> findAll() {
		// TODO Auto-generated method stub

		return (List<afp>) repository.findAll();
	}

//	@Override
//	public afp findById(String id) {
//		// TODO Auto-generated method stub
//		return repository.findById(id);
//	}

	@Override
	public afp save(afp p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public afp findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
