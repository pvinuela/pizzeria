package com.bootcamp.Dao;

import com.bootcamp.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario, Long> {
    
}
