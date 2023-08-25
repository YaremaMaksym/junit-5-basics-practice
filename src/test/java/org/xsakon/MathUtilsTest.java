package org.xsakon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void itShouldAddTwoNumbers() {
        int expected = -2;
        int actual = MathUtils.add(1, -3);

        assertEquals(expected, actual);
    }

    @Test
    void itShouldComputeCircleArea() {

        double expected = Math.PI * 100;

        assertEquals(expected, MathUtils.computeCircleArea(10));
    }

    @Test
    void itShouldDivideTwoNumbers() {

        double expected = 1;

        assertEquals(expected, MathUtils.div(3, 2));
    }

    @Test
    void itShouldThrowException() {
        assertThrows(ArithmeticException.class, () -> MathUtils.div(2, 0));
    }
}