package com.mycompany.trabajopracticodos;

public class TrabajoPracticoDos {

    public static void main(String[] args) {
        Combustible nafta = new Combustible("Nafta", 10);
        Vehiculo auto = new Auto("Chevrolet", "2GX4EE", nafta);
        Ciudad SanLuis = new Ciudad("San Luis", 7, 220);
        Ciudad Cordoba = new Ciudad("Cordoba", 7, 600);
        Viaje viajesin = new Viaje(SanLuis, Cordoba, auto, 5);
        
        viajesin.calcularDistancia();
        viajesin.calcularCostoPeajes();
        System.out.println( viajesin.calcularCostoTotalCombustible());
       
        
    }
}
