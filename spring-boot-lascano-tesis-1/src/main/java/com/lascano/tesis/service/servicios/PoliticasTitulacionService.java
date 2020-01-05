package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.politicasTitulacion;

public interface PoliticasTitulacionService {
	
	public List<politicasTitulacion> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public politicasTitulacion findById(String id);

	public politicasTitulacion save(politicasTitulacion p);

	public void delete(String id);

}
