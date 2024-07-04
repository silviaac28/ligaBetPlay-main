package com.finalbetplay.clases;

public class Arbitro extends Persona {

    private int id;
    private int experiencia;

    public Arbitro() {
    }

    public Arbitro(int experiencia, int id) {
        this.experiencia = experiencia;
        this.id = id;
    }

    public Arbitro(int experiencia, int id, String nombre, int edad, String nacionalidad) {
        super(nombre, edad, nacionalidad);
        this.experiencia = experiencia;
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }



}
