package com.autonomous;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SensorTest {

    @Test
    public void testObstacle() {
        Sensor s = new Sensor();
        assertEquals("Obstacle Detected", s.detectObstacle());
    }
}