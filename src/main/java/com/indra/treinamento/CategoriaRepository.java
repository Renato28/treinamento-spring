package com.indra.treinamento;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.treinamento.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
}
