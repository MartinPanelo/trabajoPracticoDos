package com.mycompany.trabajopracticodos;

public class TrabajoPracticoDos {

    public static void main(String[] args) {
        Combustible nafta = new Combustible("Nafta", 10);
        Combustible gnc = new Combustible("gnc", 5);
        //----------creacion de autos -----------
        Vehiculo auto = new Auto("Chevrolet", "2GX4EE", nafta,100);
        Vehiculo camioneta = new Camioneta("Jeep", "666&&&", gnc,100);
        Vehiculo camion = new Camion("Scania", "123asd", nafta,150);

        //------ creacion de ciudades --------------
        Ciudad SanLuis = new Ciudad("San Luis", 7, 220);
        Ciudad Cordoba = new Ciudad("Cordoba", 7, 600);
        Ciudad Pampa = new Ciudad("Pampa", 5, 800);

        //-----------PRIMER VIAJE--------------------------------------
        Viaje viajesin = new Viaje(SanLuis, Cordoba, auto, 5);
        viajesin.calcularDistancia();
        System.out.println("El costo de peajes es: " + viajesin.calcularCostoPeajes() + "$");
        System.out.println("El costo total de combustible es : " + viajesin.calcularCostoTotalCombustible() + "$");
        viajesin.calcularCostoTotal();

        System.out.println("---------------------------------------------");
         System.out.println("---------------------------------------------");
                //-----------SEGUNDO VIAJE--------------------------------------
        Viaje viajeDos = new Viaje(Cordoba, SanLuis, camioneta, 10);
        viajeDos.calcularDistancia();
        System.out.println("El costo de peajes es: " + viajeDos.calcularCostoPeajes() + "$");
        System.out.println("El costo total de combustible es : " + viajeDos.calcularCostoTotalCombustible() + "$");
        viajeDos.calcularCostoTotal();
        
        System.out.println("---------------------------------------------");
         System.out.println("---------------------------------------------");
                //-----------TERCER VIAJE--------------------------------------
        Viaje viajeTres = new Viaje(Cordoba, Pampa, 400, camion, 10);
        viajeTres.calcularDistancia();
        System.out.println("El costo de peajes es: " + viajeTres.calcularCostoPeajes() + "$");
        System.out.println("El costo total de combustible es : " + viajeTres.calcularCostoTotalCombustible() + "$");
        viajeTres.calcularCostoTotal();
       
    }
}
