import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SpeciesTest {
    Species specie;
    PrintStream print;

    @BeforeEach
     void setUp() {
        print = new PrintStream(System.out);
        specie = new Species("Mar", 200);
    }

    @AfterEach
    void tearDown() {
        print.flush();
    }

    @Test
    void setNameTest() {
        specie.setName("Scorpion");
        assertEquals("Scorpion", specie.getName());
    }


    @Test
    void setHeightTest() {
        specie.setHeight(220);
        assertEquals(220, specie.getHeight());
    }

    @Test
    void setAliveTest() {
        assertTrue(specie.isAlive());
        specie.setAlive(false);
        assertFalse(specie.isAlive());
    }

    @Test
    void setArmor() {
        specie.setArmor(200);
        assertEquals(200, specie.getArmor());
    }

    @Test
    void getAttackAndToStringTest() {
        specie.getAttack(5);
        assertEquals(95, specie.getArmor());
        assertEquals("Mar is still alive with 95 armor points", specie.toString());
        specie.getAttack(96);
        assertEquals(0,specie.getArmor());
        assertEquals("Mar has been out of server!", specie.toString());
    }

    @Test
    void setHitTimesTest() {
        for (int i=1; i<= 20; i++) {
            specie.setHitTimes();
            assertEquals((20-i), specie.getHitTimes());
        }
        specie.setHitTimes();
        assertEquals(0, specie.getHitTimes());

    }
}