package com.finalbetplay.clases;

import java.util.Date;

public class Lesion {
    private int id;
    private int idJugador;
    private String tipo;
    private String gravedad;
    private Date fechaInicioLesion;
    private Date fechaFinRecuperacion;
    
    public Lesion() {
    }

    public Lesion(int id, int idJugador, String tipo, String gravedad, Date fechaInicioLesion, Date fechaFinRecuperacion) {
        this.id = id;
        this.idJugador = idJugador;
        this.tipo = tipo;
        this.gravedad = gravedad;
        this.fechaInicioLesion = fechaInicioLesion;
        this.fechaFinRecuperacion = fechaFinRecuperacion;
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

    public Date getfechaInicioLesion() {
        return fechaInicioLesion;
    }

    public void setfechaInicioLesion(Date fechaInicioLesion) {
        this.fechaInicioLesion = fechaInicioLesion;
    }

    public Date getFechaFinRecuperacion() {
        return fechaFinRecuperacion;
    }

    public void setFechaFinRecuperacion(Date fechaFinRecuperacion) {
        this.fechaFinRecuperacion = fechaFinRecuperacion;
    }

}
