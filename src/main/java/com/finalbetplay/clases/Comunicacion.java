package com.finalbetplay.clases;

import java.util.Date;

public class Comunicacion {
    private int id;
    private String titulo;
    private String contenido;
    public int getId() {
        return id;
    }
    public Comunicacion(int id, String titulo, String contenido, Date fechaPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
    }
    public Comunicacion() {
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    private Date fechaPublicacion;
    

}
