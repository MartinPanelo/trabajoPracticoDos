package com.mycompany.trabajopracticodos;

public final class Camion extends Vehiculo {

    public Camion(String marca, String patente, Combustible combustible,float costoPeaje) {
        super(marca, patente, combustible,costoPeaje);
    }

    @Override
    public double calcularCostoDeCombustible() {
        return 12/100; 
    }

}
