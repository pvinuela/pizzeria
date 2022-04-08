package com.bootcamp.Services;

import java.util.List;

import com.bootcamp.entities.Ingrediente;

import org.springframework.data.domain.Sort;

public interface IngredienteService {
    
    public List<Ingrediente> findAll(Sort sort);
    public void delete (long id);
    public Ingrediente save(Ingrediente ingrediente);
}
