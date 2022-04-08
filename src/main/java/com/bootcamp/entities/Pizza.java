package com.bootcamp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Pizza implements Serializable {
    
     
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "La pizza tiene que tener un nombre")
    @Size(min = 4, max = 255, message = "El nombre tiene que tener un valor entre 4 y 255 caracteres")
    private String nombre;
    
    @Min(value = 0, message = "La pizza tiene que tener un precio")
    private double precio;

    private String foto;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, mappedBy = "pizza" )
    @NotNull(message = "La pizza tiene que tener ingredientes")
    private List<Ingrediente> ingrendientes;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "pizza")
    private List<Comentario> comentario;
    
     
    
    public Pizza() {

    }



    public Pizza(long id,
            @NotEmpty(message = "La pizza tiene que tener un nombre") @Size(min = 4, max = 255, message = "El nombre tiene que tener un valor entre 4 y 255 caracteres") String nombre,
            @Min(value = 0, message = "La pizza tiene que tener un precio") double precio, String foto,
            @NotNull(message = "La pizza tiene que tener ingredientes") List<Ingrediente> ingrendientes,
            List<Comentario> comentario) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
        this.ingrendientes = ingrendientes;
        this.comentario = comentario;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public List<Ingrediente> getIngrendientes() {
        return ingrendientes;
    }


    public void setIngrendientes(List<Ingrediente> ingrendientes) {
        this.ingrendientes = ingrendientes;
    }


    public List<Comentario> getComentario() {
        return comentario;
    }


    public void setComentario(List<Comentario> comentario) {
        this.comentario = comentario;
    }

    

    

   

    


}
