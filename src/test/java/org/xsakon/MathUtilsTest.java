package org.xsakon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    MathUtils mathUtils;

    @BeforeAll
    static void beforeAll() {
        System.out.println("This runs before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("This runs before each test");
        mathUtils = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        System.out.println("This runs after each test");
    }

    @Test
    void itShouldAddTwoNumbers() {
        MathUtils mathUtils = new MathUtils();
        int expected = -2;
        int actual = mathUtils.add(1, -3);

        assertEquals(expected, actual);
    }

    @Test
    void itShouldComputeCircleArea() {
        MathUtils mathUtils = new MathUtils();

        double expected = Math.PI * 100;

        assertEquals(expected, mathUtils.computeCircleArea(10));
    }

    @Test
    void itShouldDivideTwoNumbers() {
        MathUtils mathUtils = new MathUtils();

        double expected = 1;

        assertEquals(expected, mathUtils.div(3, 2));
    }

    @Test
    void itShouldThrowException() {
        MathUtils mathUtils = new MathUtils();

        assertThrows(ArithmeticException.class, () -> mathUtils.div(2, 0));
    }
}