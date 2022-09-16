package com.mycompany.trabajopracticodos;


public class Ciudad {
    private String nombre;
    private int ruta;
    private double km;

    public Ciudad() {
    }

    public Ciudad(String nombre, int ruta, double km) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.km = km;
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
    
    
}
