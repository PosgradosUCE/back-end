package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.iaa;

public interface IaaService {
	public List<iaa> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public iaa findById(String id);

	public iaa save(iaa p);

	public void delete(String id);
}
