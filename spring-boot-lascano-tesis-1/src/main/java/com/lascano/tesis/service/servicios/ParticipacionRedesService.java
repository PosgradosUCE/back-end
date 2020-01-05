package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.participacionRedes;

public interface ParticipacionRedesService {
	
	public List<participacionRedes> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public participacionRedes findById(String id);

	public participacionRedes save(participacionRedes p);

	public void delete(String id);

}
