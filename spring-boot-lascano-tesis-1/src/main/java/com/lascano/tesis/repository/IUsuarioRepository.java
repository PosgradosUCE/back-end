package com.lascano.tesis.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lascano.tesis.model.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername2(String username);
}