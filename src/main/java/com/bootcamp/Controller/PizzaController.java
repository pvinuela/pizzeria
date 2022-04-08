package com.bootcamp.Controller;

import java.util.List;

import com.bootcamp.Services.PizzaService;
import com.bootcamp.entities.Pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/pizzas")
public class PizzaController {
    
    @Autowired
    private PizzaService pizzaService;

    @GetMapping
    public ResponseEntity<List<Pizza>> getPizza(){

        ResponseEntity<List<Pizza>> responseEntity = null;
        List<Pizza> pizza = null;
        Sort sort = Sort.by("nombre");

        pizza = pizzaService.findAll(sort);
        
        if(pizza != null){
            
            responseEntity = new ResponseEntity<>(pizza, HttpStatus.OK);

        }else{

            responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }

        return responseEntity;
    }
}
