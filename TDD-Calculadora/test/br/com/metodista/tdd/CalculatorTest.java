package br.com.metodista.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leandro Medeiros - R.A. 250544
 * @since 08-18-2014
 */
public class CalculatorTest {
    @Test
    public void canSumTwoNumbers() {
        Calculator calc = new Calculator();
        
        assertEquals(4, calc.sum(2, 2), 0);
        assertEquals(0, calc.sum(-1, 1), 0);
    }

    @Test
    public void canSubTwoNumbers() {
        Calculator calc = new Calculator();
        
        assertEquals(0, calc.subtract(2, 2), 0);
    }

    @Test
    public void canMultiplyTwoNumbers() {
        Calculator calc = new Calculator();
        
        assertEquals(4, calc.multiply(2, 2), 0);
    }

    @Test
    public void canDivideTwoNumbers() {
        Calculator calc = new Calculator();
        
        assertEquals(1, calc.divide(2, 2), 0);
    }
}