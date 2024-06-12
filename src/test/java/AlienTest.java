import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienTest {
    Alien alien;

    @BeforeEach
    void setUp() {
        alien = new Alien("Spider", 200, "Flying");
    }

    @Test
    void setNameTest() {
        alien.setName("Cedar");
        assertEquals("Cedar", alien.getName());
    }

    @Test
    void setHeightTest() {
        alien.setHeight(alien.getHeight() + 50);
        assertEquals(250, alien.getHeight());
    }

    @Test
    void setAliveTest() {
        assertTrue(alien.isAlive());
        alien.setAlive(false);
        assertFalse(alien.isAlive());
    }

    @Test
    void setSuperPowerTest() {
        assertEquals("Flying", alien.getSuperPower());
        alien.setSuperPower("Diving");
        assertEquals("Diving", alien.getSuperPower());
    }

    @Test
    void testToStringTest() {
        assertEquals("Spider is 200 in height and has special power is Flying", alien.toString());
    }
}