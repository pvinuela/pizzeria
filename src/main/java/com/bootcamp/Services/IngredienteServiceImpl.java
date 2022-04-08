package com.bootcamp.Services;

import java.util.List;

import com.bootcamp.Dao.IngredienteDao;
import com.bootcamp.entities.Ingrediente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

public class IngredienteServiceImpl implements IngredienteService {

    @Autowired
    private IngredienteDao ingredienteDao;

    @Override
    public List<Ingrediente> findAll(Sort sort) {
        
        return ingredienteDao.findAll(sort); 
    }

    @Override
    public void delete(long id) {

        ingredienteDao.deleteById(id);
        
    }

    @Override
    public Ingrediente save(Ingrediente ingrediente) {
        
        return ingredienteDao.save(ingrediente);
    }
    
}
