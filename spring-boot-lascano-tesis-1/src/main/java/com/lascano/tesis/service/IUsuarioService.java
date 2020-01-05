package com.lascano.tesis.service;

import com.lascano.tesis.model.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
}
