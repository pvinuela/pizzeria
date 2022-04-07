package com.bootcamp.entities;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Comentario {
    
    private String texto;
    private double puntuacion;
    private LocalDate fecha;
    private String nombre;
    private String pizza;
    
    public Comentario() {
    }

    public Comentario(String texto, double puntuacion, LocalDate fecha, String nombre, String pizza) {
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.nombre = nombre;
        this.pizza = pizza;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    
    
}
