package com.mycompany.trabajopracticodos;

public final class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible,float costoPeaje) {
        super(marca, patente, combustible,costoPeaje);
    }

    @Override
    public double calcularCostoDeCombustible(Combustible combustible) {
        return 10/100*super.getCombustible().getPrecioCombustible();
    }

}
