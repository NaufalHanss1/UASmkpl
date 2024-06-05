/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.uasmkpl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oyest
 */
public class UASMkplTest {
    
      @Test
    public void testAddition() {
        double num1 = 5.0;
        double num2 = 3    .0;
        double expectedResult = 8.0;

        double result = calculate(num1, '+', num2);

        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        double num1 = 10.0;
        double num2 = 4.0;
        double expectedResult = 6.0;

        double result = calculate(num1, '-', num2);

        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        double num1 = 2.0;
        double num2 = 6.0;
        double expectedResult = 12.0;

        double result = calculate(num1, '*', num2);

        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testDivision() {
        double num1 = 15.0;
        double num2 = 3.0;
        double expectedResult = 5.0;

        double result = calculate(num1, '/', num2);

        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        double num1 = 10.0;
        double num2 = 0.0;

        assertThrows(IllegalArgumentException.class, () -> calculate(num1, '/', num2));
    }

    @Test
    public void testInvalidOperation() {
        double num1 = 5.0;
        double num2 = 31.0;

        assertThrows(IllegalArgumentException.class, () -> calculate(num1, '%', num2));
    }

    private static double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new IllegalArgumentException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
    
}
