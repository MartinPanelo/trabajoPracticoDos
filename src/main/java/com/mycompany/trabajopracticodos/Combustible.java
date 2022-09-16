package com.mycompany.trabajopracticodos;

public class Combustible {
    
   private String tipoDeCombustible;
   private double precioCombustible;

    public Combustible(String tipoDeCombustible, double precioCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
        this.precioCombustible = precioCombustible;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public double getPrecioCombustible() {
        return precioCombustible;
    }

    public void setPrecioCombustible(double precioCombustible) {
        this.precioCombustible = precioCombustible;
    }
   
   
}
