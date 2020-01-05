package com.lascano.tesis.service.servicios;

import java.util.List;

import com.lascano.tesis.model.entidades.gestioAcademica;

public interface gestionAcademicaService {

	public List<gestioAcademica> findAll();

//	public Page<afp> findAll(Pageable pageable);

	public gestioAcademica findById(String id);

	public gestioAcademica save(gestioAcademica p);

	public void delete(String id);
}
