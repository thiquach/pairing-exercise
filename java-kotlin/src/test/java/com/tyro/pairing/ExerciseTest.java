package com.tyro.pairing;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {

    @Test
    void shouldFail() {
        assertEquals(true, false);
    }

    @Test
    void testAdd() {
        Exercise calculator = new Exercise();
        assertEquals(12, calculator.add(5,7));
        assertEquals(-1, calculator.add(2,-3));
        assertEquals(0, calculator.add(2,-2));
    }

    @Test
    void testSubtract() {
        Exercise calculator = new Exercise();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    void testMultiply() {
        Exercise calculator = new Exercise();
        assertEquals(6, calculator.multiply(2,3));
        assertEquals(-6, calculator.multiply(-2,3));
        assertEquals(0, calculator.multiply(2,0));
    }

    @Test
    public void testDivide() {
        Exercise calculator = new Exercise();
        assertEquals(2.0, calculator.divide(6, 3), 0.001);
        assertEquals(-2.0, calculator.divide(6, -3), 0.001);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(6, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
