package com.finalbetplay.clases;

public class Entrenador extends Persona{

    private int id;
    private int experiencia;
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
    public Entrenador(int id, int experiencia) {
        this.id = id;
        this.experiencia = experiencia;
    }
    public Entrenador(String nombre, int edad, String nacionalidad, int id, int experiencia) {
        super(nombre, edad, nacionalidad);
        this.id = id;
        this.experiencia = experiencia;
    }
    public Entrenador() {
    }


}