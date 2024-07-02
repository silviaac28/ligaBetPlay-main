package com.finalbetplay.clases;

import java.util.ArrayList;
import java.util.List;


public class Equipo{
    private int id;
    private String nombre;
    private String ciudad;
    private String estadio;
    private String entrenador;
    private List<Jugador> listaJugadores = new ArrayList<>();
    private List<Partido> listaPartidos = new ArrayList<>();
    
    public Equipo() {
    }

    public Equipo(int id, String nombre, String ciudad, String estadio, String entrenador, List<Jugador> listaJugadores,
            List<Partido> listaPartidos) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.entrenador = entrenador;
        this.listaJugadores = listaJugadores;
        this.listaPartidos = listaPartidos;
    }


    public void addJugador(Jugador jugador){
        this.listaJugadores.add(jugador);
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public List<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }
    
    

    
}
