package com.finalbetplay.clases;

import java.sql.Time;
import java.util.Date;

public class Partido {
    private int id;
    private Date fecha;
    private Time hora;
    private String estadio;
    private String equipoLocal;
    private String equipoVisitante;
    
    public Partido() {
    }

    public Partido(int id, Date fecha, Time hora, String estadio, String equipoLocal, String equipoVisitante) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.estadio = estadio;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }


}