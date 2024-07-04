package com.finalbetplay.clases;

import java.util.ArrayList;
import java.util.List;

public class MedioComunicacion {
    private int id;
    private String nombre;
    private String tipo;
    private List<Usuario> listaPeriodistas = new ArrayList<>();

    public MedioComunicacion() {
    }
    
    public MedioComunicacion(int id, String nombre, String tipo, List<Usuario> listaPeriodistas) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaPeriodistas = listaPeriodistas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Usuario> getListaPeriodistas() {
        return listaPeriodistas;
    }

    public void setListaPeriodistas(List<Usuario> listaPeriodistas) {
        this.listaPeriodistas = listaPeriodistas;
    }   
}
