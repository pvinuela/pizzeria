package com.bootcamp.Services;

import java.util.List;

import com.bootcamp.Dao.ComentarioDao;
import com.bootcamp.entities.Comentario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private ComentarioDao comentarioDao;

    @Override
    public List<Comentario> findAll(Sort sort) {
    
        return comentarioDao.findAll(sort);
        
    }

    @Override
    public void delete(long id) {
        
        comentarioDao.deleteById(id);
        
    }

    @Override
    public Comentario save(Comentario comentario) {
        
        return comentarioDao.save(comentario);
    }


    
}
