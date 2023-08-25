package org.xsakon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void itShouldAddTwoNumbers() {
        MathUtils mathUtils = new MathUtils();
        int expected = -2;
        int actual = mathUtils.add(1, -3);

        assertEquals(expected, actual);
    }
}