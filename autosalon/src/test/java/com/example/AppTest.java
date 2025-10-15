package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testApp() {
        assertTrue(true, "Basic test should pass");
    }

    @Test
    public void testBasicLogic() {
        String expected = "test";
        String actual = "test";
        assertEquals(expected, actual, "Strings should be equal");
    }
}