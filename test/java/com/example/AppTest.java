package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testOddEven() {
        App app = new App();
        assertEquals("Even", app.checkOddEven(4));
        assertEquals("Odd", app.checkOddEven(7));
    }
}
