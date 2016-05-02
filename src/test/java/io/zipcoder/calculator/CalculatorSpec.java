package io.zipcoder.calculator;

import org.junit.Test;
import static io.zipcoder.calculator.Calculator.*;
import static org.junit.Assert.*;

public class CalculatorSpec {

    @Test
    public void addTest(){
        int expected = 4;
        int actual = add(2,2);
        assertEquals("Adding the values of 2 plus 2", expected, actual);
    }

    @Test
    public void subtractTest(){
        int expected = 4;
        int actual = subtract(6,2);
        assertEquals("Subtracting the values of 2 plus 2", expected, actual);
    }

    @Test
    public void multiplyTest(){
        int expected = 4;
        int actual = multiply(2,2);
        assertEquals("Multiplying the values of 2 plus 2", expected, actual);
    }

    @Test
    public void divideTest(){
        double expected = 2.5;
        double actual = divide(5,2);
        assertEquals(expected, actual,0.1);
    }
}
