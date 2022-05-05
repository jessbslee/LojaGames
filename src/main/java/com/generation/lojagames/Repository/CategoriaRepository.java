package com.generation.lojagames.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.model.CategoriaModel;

	@Repository
	public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long> {  
	

}
