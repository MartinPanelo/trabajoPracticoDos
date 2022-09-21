package com.mycompany.trabajopracticodos;

public final class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible, float costoPeaje) {
        super(marca, patente, combustible,costoPeaje);
    }

    @Override
    public double calcularCostoDeCombustible(Combustible combustible) {
        return 7/100* super.getCombustible().getPrecioCombustible();
    }

}
