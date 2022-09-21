package com.mycompany.trabajopracticodos;

public abstract class Vehiculo {
    
    private String marca;
    private String patente;
    private Combustible combustible;
    private float costoPeaje;
    
    public Vehiculo() {
    }

   

    public Vehiculo(String marca, String patente, Combustible combustible, float costoPeaje) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
        this.costoPeaje = costoPeaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    
     public float getCostoPeaje() {
        return costoPeaje;
    }

    public void setCostoPeaje(float costoPeaje) {
        this.costoPeaje = costoPeaje;
    }
    
    public abstract double calcularCostoDeCombustible(Combustible combustible);
    
    
}
