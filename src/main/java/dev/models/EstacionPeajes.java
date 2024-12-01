package dev.models;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeajes {

    private int id;
    private String nombre;
    private String ciudad;
    private double totalPeajes;
    List<Vehiculo> vehiculos;

    public EstacionPeajes(){

    }

    public EstacionPeajes( int id, String nombre,String ciudad, double totalPeajes) {

        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalPeajes = totalPeajes;
        this.vehiculos = new ArrayList<>();

    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getCiudad() {

        return ciudad;

    }

    public void setCiudad(String ciudad) {

        this.ciudad = ciudad;

    }

    public double getTotalPeajes() {

        return totalPeajes;

    }

    public void setTotalPeajes(double totalPeajes) {

        this.totalPeajes = totalPeajes;

    }

    public List<Vehiculo> getVehiculos() {

        return vehiculos;

    }

    public void setVehiculos(List<Vehiculo> vehiculos) {

        this.vehiculos = vehiculos;

    }

    public double cobrarPeaje(Vehiculo vehiculo) { 

        double peaje = vehiculo.calcularPeaje();
        totalPeajes += peaje;
        vehiculos.add(vehiculo);
        return totalPeajes;

    }

    public void imprimirImporte(){

        System.out.println("Estacion: "+ nombre + "Ciudad: "+ ciudad);
        for(Vehiculo vehiculo : vehiculos){

            System.out.println("Vehiculo: "+ vehiculo.getPlaca() +"Peaje: "+ vehiculo.calcularPeaje());

        }
        
        System.out.println("Total peajes: "+ totalPeajes);

    }



}
