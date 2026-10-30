package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void addReturnsSum() {
        assertEquals(5.0, service.add(2, 3));
    }

    @Test
    void subtractReturnsDifference() {
        assertEquals(-1.0, service.subtract(2, 3));
    }

    @Test
    void multiplyReturnsProduct() {
        assertEquals(6.0, service.multiply(2, 3));
    }

    @Test
    void divideReturnsQuotient() {
        assertEquals(2.5, service.divide(5, 2));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> service.divide(1, 0));
    }
}
