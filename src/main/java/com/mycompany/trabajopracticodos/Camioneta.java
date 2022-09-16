package com.mycompany.trabajopracticodos;

public final class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible c) {
        super(marca, patente, c);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return (distancia *10)/100;
    }

}
