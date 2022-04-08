package com.bootcamp.Dao;

import com.bootcamp.entities.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioDao extends JpaRepository <Comentario, Long> {
    
}
