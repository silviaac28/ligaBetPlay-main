package com.finalbetplay.clases;

import java.util.Date;

public class Lesion {
    private int id;
    private int idJugador;
    private String tipo;
    private String gravedad;
    private Date fechaInicio;
    private Date fechaFin;
    
    public Lesion() {
    }

    public Lesion(int id, int idJugador, String tipo, String gravedad, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.idJugador = idJugador;
        this.tipo = tipo;
        this.gravedad = gravedad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

}
