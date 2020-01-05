package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.perfilEgreso;

public interface PerfilEgresoService {

	public List<perfilEgreso> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public perfilEgreso findById(String id);

	public perfilEgreso save(perfilEgreso p);

	public void delete(String id);
	
}
