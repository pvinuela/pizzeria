package com.bootcamp.Services;

import java.util.List;

import com.bootcamp.Dao.PizzaDao;
import com.bootcamp.entities.Pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaDao pizzaDao;
    

    @Override
    public List<Pizza> findAll(Sort sort) {

        return pizzaDao.findAll(sort);
    }

    @Override
    public void delete(long id) {
        
        pizzaDao.deleteById(id);
        
    }

    @Override
    public Pizza save(Pizza pizza) {
        
        return pizzaDao.save(pizza);
    }



}
