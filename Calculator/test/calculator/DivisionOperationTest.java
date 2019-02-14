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
public class DivisionOperationTest {

    /**
     * Test of evaluate method, of class DivisionOperation.
     */
    @Test
    public void testEvaluate() {
        INumber left = new Number(20);
        INumber right = new Number(5);
        
        DivisionOperation instance = new DivisionOperation();
        
        INumber expResult = new Number(4);
        
        INumber result = instance.evaluate(left, right);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getOperationDescription method, of class DivisionOperation.
     */
    @Test
    public void testGetOperationDescription() {
        INumber left = new Number(10);
        INumber right = new Number(5);
        
        DivisionOperation instance = new DivisionOperation();
        
        INumber expResult = new Number(5);
        
        INumber result = instance.evaluate(left, right);
        
        assertNotEquals(expResult, result);
    }
    
}
