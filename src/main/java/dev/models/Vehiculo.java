package dev.models;

abstract class Vehiculo {
    private String placa;

    public Vehiculo(){

    }

    public Vehiculo(String placa) {

        this.placa = placa;

    }

    
    public String getPlaca() {

        return placa;

    }

    public void setPlaca(String placa) {

        this.placa = placa;

    }

    public abstract double calcularPeaje();
    
}
