package com.example.app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.*;

public class calcTest {
    calc calculator = new calc();

    @BeforeAll
    public static void setup() {
        System.out.println("Setting up tests...");
    }
    @BeforeEach
    public void init() {
        System.out.println("Starting a test...");
    }
    @AfterEach
    public void tearDown() {
        System.out.println("Finished a test.");
    }
    @AfterAll
    public static void cleanup() {
        System.out.println("All tests completed.");
    }
    @Test
    public void testAdd() {
        Assert.assertEquals(5, calculator.add(2, 3), 0.0);
        Assert.assertNotNull(calculator);
    }

    // @Test
    // public void testSubtract() {
    //     assertEquals(3, calculator.subtract(5, 2));
    // }

    // @Test
    // public void testMultiply() {
    //     assertEquals(12, calculator.multiply(4, 3));
    // }

    // @Test
    // public void testDivide() {
    //     assertEquals(5, calculator.divide(10, 2));
    // }

    // @Test(expected = IllegalArgumentException.class)
    // public void testDivideByZero() {
    //     calculator.divide(10, 0);   
    // }

    // @Test
    // public void testModulus() {
    //     assertEquals(1, calculator.modulus(10, 3));
    // }
}
