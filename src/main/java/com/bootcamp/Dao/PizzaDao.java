package com.bootcamp.Dao;

import java.util.List;

import com.bootcamp.entities.Pizza;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PizzaDao extends JpaRepository  <Pizza, Long> {
    


}