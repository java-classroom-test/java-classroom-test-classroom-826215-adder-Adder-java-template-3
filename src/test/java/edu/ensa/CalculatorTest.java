package edu.ensa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd() {
      Calculator calculator = new Calculator();
      int result = calculator.add(1, 2);
      assertTrue(result == 3);
    }
}
