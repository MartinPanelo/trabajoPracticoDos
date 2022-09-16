package com.mycompany.trabajopracticodos;


public class Ciudad {
    private String nombre;
    private int ruta;
    private double km;
    private double costoPeaje; 

    public Ciudad(String nombre, int ruta, double km) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.km = km;
        this.costoPeaje = 150.0;
    }

    public Ciudad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getCostoPeaje() {
        return costoPeaje;
    }

    public void setCostoPeaje(double costoPeaje) {
        this.costoPeaje = costoPeaje;
    }

    
    
    
}
