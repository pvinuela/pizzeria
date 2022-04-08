package com.bootcamp.Services;

import java.util.List;

import com.bootcamp.Dao.UsuarioDao;
import com.bootcamp.entities.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAll(Sort sort) {
        
        return usuarioDao.findAll(sort);
    }

    @Override
    public void delete(long id) {
        
        usuarioDao.deleteById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        
        return usuarioDao.save(usuario);
    }
    
}
