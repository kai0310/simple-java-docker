package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateTest extends Calculate {
    @Test
    void testAdd() {
        Calculate cal = new Calculate();

        int expected = 5;
        int actual = cal.add(2, 3);

        assertEquals(actual, expected);
    }
}
