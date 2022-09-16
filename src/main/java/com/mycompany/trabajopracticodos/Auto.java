package com.mycompany.trabajopracticodos;

public final class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCostoDeCombustible() {
        return 7/100;
    }

}
