package com.finalbetplay.clases;

import java.util.ArrayList;
import java.util.List;

public class Rol {
    private int id;
    private String nombre;
    private List<Permiso> listaPermisos = new ArrayList<>();

    

    public Rol() {

    }

    @Override
    public String toString(){
        return nombre;
    }

    public Rol(int id, String nombre, String permisos, List<Permiso> listapPermisos) {
        this.id = id;
        this.nombre = nombre;
        this.listaPermisos = listapPermisos;
    }

    
    public void addPermiso(Permiso permiso){
        this.listaPermisos.add(permiso);
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

    public List<Permiso> getListapPermisos() {
        return listaPermisos;
    }

    public void setListapPermisos(List<Permiso> listapPermisos) {
        this.listaPermisos = listapPermisos;
    }


}
