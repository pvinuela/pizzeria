package com.bootcamp.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Pizza implements Serializable {
    
    private String nombre;
    private String foto;
}
