package org.example;

import org.example.exceptions.InvalidOperatorException;
import org.junit.*;


public class CalculatorTest {

    private Calculator calculator = null;
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() throws InvalidOperatorException {
        Assert.assertEquals(5.0, calculator.calculate(1.0,4.0, '+'), 0.0);
    }

    @Test
    public void testSubtract() throws InvalidOperatorException {
        Assert.assertEquals(-3.0, calculator.calculate(1.0,4.0, '-'), 0.0);
    }

    @Test
    public void testMultiply() throws InvalidOperatorException {
        Assert.assertEquals(12.0, calculator.calculate(3.0,4.0, '*'), 0.0);
    }

    @Test
    public void testDivide() throws InvalidOperatorException {
        Assert.assertEquals(2.0, calculator.calculate(8.0,4.0, '/'), 0.0);
    }

    @Test
    public void testPow() throws InvalidOperatorException {
        Assert.assertEquals(64.0, calculator.calculate(8.0,2.0, '^'), 0.0);
    }

    @Test(expected = InvalidOperatorException.class)
    public void testInvalidParameter() throws InvalidOperatorException {
        calculator.calculate(8.0,2.0, 'a');
    }
}