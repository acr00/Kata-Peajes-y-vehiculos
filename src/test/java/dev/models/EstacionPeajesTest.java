package dev.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class EstacionPeajesTest {

    @Test
    void testConst() {

        int id = 1;
        String nombre = "Peaje";
        String ciudad = "Ciudad";
        double totalPeajes = 10.0;
        EstacionPeajes peaje = new EstacionPeajes(id, nombre, ciudad, totalPeajes);
        
        assertEquals(id, peaje.getId());
        assertEquals(nombre, peaje.getNombre());
        assertEquals(ciudad, peaje.getCiudad());
        assertEquals(totalPeajes, peaje.getTotalPeajes());
        assertNotNull(peaje.getVehiculos());
        assertTrue(peaje.getVehiculos().isEmpty());

    }

    @Test
    void testSetters() {

        EstacionPeajes peaje = new EstacionPeajes();
        
        peaje.setId(1);
        assertEquals(1, peaje.getId());

        peaje.setNombre("Peaje");
        assertEquals("Peaje", peaje.getNombre());

        peaje.setCiudad("Ciudad");
        assertEquals("Ciudad", peaje.getCiudad());

        peaje.setTotalPeajes(10.0);
        assertEquals(10.0, peaje.getTotalPeajes());

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Coche("XXX123"));
        peaje.setVehiculos(vehiculos);
        assertEquals(vehiculos, peaje.getVehiculos());

    }

    @Test
    void testCobrarPeajeUnVehiculo() {

        EstacionPeajes estacion = new EstacionPeajes(1, "Estación", "Ciudad", 0);
        Vehiculo coche = new Coche("XXX123");
        double totalPeajes = estacion.cobrarPeaje(coche);
        
        assertEquals(100.0, totalPeajes);
        assertEquals(1, estacion.getVehiculos().size());
        assertTrue(estacion.getVehiculos().contains(coche));

    }

    @Test
    void testCobrarPeajeMultiplesVehiculos() {

        EstacionPeajes estacion = new EstacionPeajes(1, "Estación", "Ciudad", 0);
        Vehiculo coche1 = new Coche("XXX123");
        Vehiculo coche2 = new Coche("YYY456");
        
        estacion.cobrarPeaje(coche1);
        double totalPeajes = estacion.cobrarPeaje(coche2);
        
        assertEquals(200.0, totalPeajes);
        assertEquals(2, estacion.getVehiculos().size());
        assertTrue(estacion.getVehiculos().contains(coche1));
        assertTrue(estacion.getVehiculos().contains(coche2));

    }

    @Test
    void testVisualizar() {

        EstacionPeajes estacion = new EstacionPeajes(1, "Estación", "Ciudad", 0);
        Vehiculo coche1 = new Coche("XXX123");
        Vehiculo coche2 = new Coche("YYY456");
        estacion.cobrarPeaje(coche1);
        estacion.cobrarPeaje(coche2);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        estacion.imprimirImporte();

        String expectedOutput = "Estacion: Estación"+"Ciudad: Ciudad\n" +
                                "Vehiculo: XXX123"+"Peaje: 100.0\n" +
                                "Vehiculo: YYY456"+"Peaje: 100.0\n" +
                                "Total peajes: 200.0\n";

        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);
    }

    @Test
    void testConstVacio() {

        EstacionPeajes peaje = new EstacionPeajes();
        assertNotNull(peaje);
        assertEquals(0, peaje.getId());
        assertNull(peaje.getNombre());
        assertNull(peaje.getCiudad());
        assertEquals(0.0, peaje.getTotalPeajes());
        assertNull(peaje.getVehiculos());

    }
}
