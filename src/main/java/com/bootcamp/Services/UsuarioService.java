package com.bootcamp.Services;

import java.util.List;

import com.bootcamp.entities.Usuario;

import org.springframework.data.domain.Sort;

public interface UsuarioService {

    public List<Usuario> findAll(Sort sort);
    public void delete(long id);
    public Usuario save(Usuario usuario);
    
}
