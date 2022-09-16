package com.mycompany.trabajopracticodos;

public final class Camion extends Vehiculo {

    public Camion(String marca, String patente, Combustible c) {
        super(marca, patente, c);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return (distancia *12)/100;
    }

}
