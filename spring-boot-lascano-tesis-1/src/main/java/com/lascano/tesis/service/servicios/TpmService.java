package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.tpm;

public interface TpmService {

	public List<tpm> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public tpm findById(String id);

	public tpm save(tpm p);

	public void delete(String id);
}
