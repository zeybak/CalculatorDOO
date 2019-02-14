/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mauro
 */
public class MultiplicationOperationTest {

    /**
     * Test of evaluate method, of class MultiplicationOperation.
     */
    @Test
    public void testEvaluate() {
        INumber left = new Number(4);
        INumber right = new Number(5);
        
        MultiplicationOperation instance = new MultiplicationOperation();
        
        INumber expResult = new Number(20);
        
        INumber result = instance.evaluate(left, right);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getOperationDescription method, of class MultiplicationOperation.
     */
    @Test
    public void testGetOperationDescription() {
        INumber left = new Number(1);
        INumber right = new Number(2);
        
        MultiplicationOperation instance = new MultiplicationOperation();
        
        INumber expResult = new Number(1);
        
        INumber result = instance.evaluate(left, right);
        
        assertNotEquals(expResult, result);
    }
    
}
