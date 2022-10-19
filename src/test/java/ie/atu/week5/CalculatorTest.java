package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(3, myCalc.add(1,2));
    }

    @Test
    void testMultiply() {
        assertEquals(8, myCalc.multiply(2,4));
    }

    @Test
    void testSubtract() {
        assertEquals(2, myCalc.subtract(3,1));
    }

    @Test
    void testDivide() {
        assertEquals(3, myCalc.divide(6,2));
    }

    @AfterEach
    void tearDown() {
    }
}