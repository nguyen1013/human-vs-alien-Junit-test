import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest {
    Human human;

    @BeforeEach
    void setUp() {
        human = new Human("Jack", 180, "English");
    }

    @Test
    void setSpeakTest() {
        assertEquals("English", human.getSpeak());
        human.setSpeak("French");
        assertEquals("French", human.getSpeak());
    }

    @Test
    void testToStringTest() {
        assertEquals("Jack is 180 in height and speak English", human.toString());
    }
}