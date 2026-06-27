package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Setup method run before each test
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        // Teardown method run after each test
        calculator.clear();
    }

    @Test
    public void testAdd() {
        // Arrange
        int numberToAdd = 5;

        // Act
        calculator.add(numberToAdd);

        // Assert
        assertEquals(5, calculator.getResult(), "Addition failed");
    }

    @Test
    public void testSubtract() {
        // Arrange
        int numberToSubtract = 3;

        // Act
        calculator.subtract(numberToSubtract);

        // Assert
        assertEquals(-3, calculator.getResult(), "Subtraction failed");
    }
}
