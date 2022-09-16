package com.mycompany.trabajopracticodos;

public final class Camion extends Vehiculo {

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCostoDeCombustible() {
        return 12/100; 
    }

}
