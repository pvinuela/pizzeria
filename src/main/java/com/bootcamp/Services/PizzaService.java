package com.bootcamp.Services;

import java.util.List;
import com.bootcamp.entities.Pizza;

import org.springframework.data.domain.Sort;


public interface PizzaService {

    public List<Pizza> findAll(Sort sort);

    public void delete(long id);

    public Pizza save(Pizza pizza);
    
}
