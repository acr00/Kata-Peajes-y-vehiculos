package dev.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CamionTest {
    @Test
    void testEjesCamion(){

        Camion camion = new Camion();
        camion.setEjes(3);
        assertEquals(3, camion.getEjes());
        
    }
}
