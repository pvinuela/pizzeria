package com.bootcamp.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Pizza implements Serializable {
    
    private long id;
    private String nombre;
    private String foto;
    private String ingredientes;
    private String comentarios;
    private double precio;
     
    
    public Pizza() {

    }

    public Pizza(long id, String nombre, String foto, String ingredientes, String comentarios, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.ingredientes = ingredientes;
        this.comentarios = comentarios;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

   

    


}
