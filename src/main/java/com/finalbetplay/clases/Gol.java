package com.finalbetplay.clases;

import java.sql.Time;

public class Gol {
    public Gol(int id, int idJugador, int idEquipo, Time minuto, int idPartido) {
        this.id = id;
        this.idJugador = idJugador;
        this.idEquipo = idEquipo;
        this.minuto = minuto;
        this.idPartido = idPartido;
    }

    private int id;
    private int idJugador;
    private int idEquipo;
    private Time minuto;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Time getMinuto() {
        return minuto;
    }

    public void setMinuto(Time minuto) {
        this.minuto = minuto;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    private int idPartido;
    
    public Gol() {
    }

}
