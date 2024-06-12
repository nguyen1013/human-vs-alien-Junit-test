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
    void humanAttack() {
    }

    @Test
    void alienAttack() {
    }
}