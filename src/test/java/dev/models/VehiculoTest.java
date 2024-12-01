package dev.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

    @Test
    void testPlacaCoche(){
        
        Vehiculo vehiculo = new Coche();
        vehiculo.setPlaca("XXX123");
        assertEquals("XXX123", vehiculo.getPlaca());

    }

    @Test
    void testCalcularPeajeCoche(){

        Vehiculo vehiculo = new Coche("XXX123");
        assertEquals(100.0, vehiculo.calcularPeaje());

    }

    @Test
    void testPlacaMoto(){

        Vehiculo vehiculo = new Moto();
        vehiculo.setPlaca("XXX123");
        assertEquals("XXX123", vehiculo.getPlaca());

    }

    @Test
    void testCalcularPeajeMoto(){

        Vehiculo vehiculo = new Moto("XXX123");
        assertEquals(50.0, vehiculo.calcularPeaje());

    }

    @Test
    void testPlacaCamion(){

        Vehiculo vehiculo = new Camion();
        vehiculo.setPlaca("XXX123");
        assertEquals("XXX123", vehiculo.getPlaca());

    }

    @Test
    void testCalcularPeaje(){

        Vehiculo vehiculo = new Camion("XXX123",2);
        assertEquals(100.0, vehiculo.calcularPeaje());

    }

}
