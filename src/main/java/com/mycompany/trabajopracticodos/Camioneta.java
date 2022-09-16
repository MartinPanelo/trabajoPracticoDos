package com.mycompany.trabajopracticodos;

public final class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCostoDeCombustible() {
        return 10/100;
    }

}
