/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.calculadora.mvn;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author william
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double number1 = 7.0;
        double number2 = 5.0;
        Calculator instance = new Calculator();
        double expResult = 12.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 6.0;
        double number2 = 2.0;
        Calculator instance = new Calculator();
        double expResult = 4.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 7.0;
        double number2 = 5.0;
        Calculator instance = new Calculator();
        double expResult = 35.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double number1 = 24.0;
        double number2 = 3.0;
        Calculator instance = new Calculator();
        double expResult = 8.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
    
}
