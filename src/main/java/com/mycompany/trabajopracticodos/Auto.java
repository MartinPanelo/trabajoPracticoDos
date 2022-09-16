package com.mycompany.trabajopracticodos;

public final class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible c) {
        super(marca, patente, c);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        return (distancia *7)/100;
    }

}
