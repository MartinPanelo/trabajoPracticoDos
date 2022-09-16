package com.mycompany.trabajopracticodos;

public class Viaje {

    private Ciudad origen;
    private Ciudad destino;
    private double distancia;
    private Vehiculo vehiculo;
    private int cantidadPeajes;

    public Viaje() {
    }

    public Viaje(Ciudad origen, Ciudad destino, double distancia, Vehiculo vehiculo, int cantidadPeajes) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.cantidadPeajes = cantidadPeajes;
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantidadPeajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.cantidadPeajes = cantidadPeajes;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadPeajes() {
        return cantidadPeajes;
    }

    public void setCantidadPeajes(int cantidadPeajes) {
        this.cantidadPeajes = cantidadPeajes;
    }

    public void calcularDistancia() {
        double distanciaEntreCiudades = Math.abs(destino.getKm() - origen.getKm());
        System.out.println("La distancia entre estas dos ciudades es de :" + distanciaEntreCiudades + "KM");
    }

    public double calcularCostoPeajes() {// ES DIFERIDO DEPENDIENDO EL VEHICULO VER CON INSTANCEOF
         double costoPeajes = this.cantidadPeajes * origen.getCostoPeaje();
        System.out.println("El costo total del peaje es de :" + costoPeajes + "");
        return costoPeajes;
    }

    public double calcularCostoTotalCombustible() {

        System.out.println("El costo total del combustible es de :" + vehiculo.calcularCostoDeCombustible() * Math.abs(destino.getKm() - origen.getKm()) * vehiculo.getCombustible().getPrecioCombustible() + "$");
        return vehiculo.calcularCostoDeCombustible() * Math.abs(destino.getKm() - origen.getKm()) * vehiculo.getCombustible().getPrecioCombustible();
    }
    
    public void calcularCostoTotal(){
        System.out.println("El costo total es de :" + (calcularCostoTotalCombustible() + calcularCostoPeajes()));
        
        
    }

}
