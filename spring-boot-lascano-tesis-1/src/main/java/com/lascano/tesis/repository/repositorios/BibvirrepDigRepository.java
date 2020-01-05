package com.lascano.tesis.repository.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lascano.tesis.model.entidades.bibvirrepDig;

@Repository
public interface BibvirrepDigRepository extends JpaRepository<bibvirrepDig, String>{

}
