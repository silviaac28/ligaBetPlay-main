package com.finalbetplay.clases;

import java.util.Date;

public class Entrada {
    private int id;
    private Date fechaCompra;
    private int cantidad;
    private double precioTotal;
    private String ubicacion;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Entrada() {
    }
    public Entrada(int id, Date fechaCompra, int cantidad, double precioTotal, String ubicacion) {
        this.id = id;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.ubicacion = ubicacion;
    }

}
