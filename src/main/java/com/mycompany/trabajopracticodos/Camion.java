/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajopracticodos;

/**
 *
 * @author ezequ
 */
public final class Camion extends Vehiculo{

    public Camion(String marca, String patente, Combustible c) {
        super(marca, patente, c);
    }

    @Override
    public double calcularCostoDeCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
