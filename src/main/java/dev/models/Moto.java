package dev.models;

public class Moto extends Vehiculo {

    public Moto(){

    }

    public Moto(String placa) {

        super(placa);
    }
    
    @Override
    public double calcularPeaje() {

        return 50.0;
        
    }

}
