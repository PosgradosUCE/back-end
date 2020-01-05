package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.gruposInvestigacion;

public interface GruposInvestigacionService {

	public List<gruposInvestigacion> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public gruposInvestigacion findById(String id);

	public gruposInvestigacion save(gruposInvestigacion p);

	public void delete(String id);

}
