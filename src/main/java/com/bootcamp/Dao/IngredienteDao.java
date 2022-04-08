package com.bootcamp.Dao;

import com.bootcamp.entities.Ingrediente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteDao extends JpaRepository <Ingrediente, Long> {
    
}
