package com.finalbetplay.clases;

public class Permiso {
    private int id;
    private String descripcion;

    public Permiso() {
    }

    @Override
    public String toString(){
        return descripcion;
    }
    

    public Permiso(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}
