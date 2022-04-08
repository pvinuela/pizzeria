package com.bootcamp.Services;

import java.util.List;

import com.bootcamp.entities.Comentario;

import org.springframework.data.domain.Sort;

public interface ComentarioService {

    public List<Comentario> findAll(Sort sort);
    public void delete(long id);
    public Comentario save(Comentario comentario);
    
}
