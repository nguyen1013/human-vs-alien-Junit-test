import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvironmentTest {
    Human human;
    Alien alien;

    @BeforeEach
    void setUp() {
        human = new Human("Jack", 180, "English");
        alien = new Alien("Spider", 200, "Flying");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void humanAttackTest() {
        int count = 0;
        assertEquals("Spider is 200 in height and has special power is Flying", alien.toString());
        while(alien.isAlive()) {
            count ++;
            Environment.humanAttack(human, alien);
        }
        assertEquals(15, count);
        assertEquals(5, human.getHitTimes());
        assertEquals("Spider is out of server!", alien.toString());
    }

    @Test
    void alienAttackTest() {
        int count = 0;
        assertEquals("Jack is 180 in height and speak English", human.toString());
        while(human.isAlive()) {
            count ++;
            Environment.alienAttack(alien, human);
        }
        assertEquals(20, count);
        assertEquals(0, alien.getHitTimes());
        assertEquals("Jack is out of server!", human.toString());
    }
}