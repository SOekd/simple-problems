import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringInverterTest {

    @Test
    void invertString() {
        assertEquals("dlroW ,olleH", StringInverter.invertString("Hello, World"));
        assertEquals("321", StringInverter.invertString("123"));
        assertEquals("", StringInverter.invertString(""));
        assertEquals("a", StringInverter.invertString("a"));
    }

}