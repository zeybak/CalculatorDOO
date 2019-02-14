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
public class SubstractionOperationTest {
    
    public SubstractionOperationTest() {
    }

    /**
     * Test of evaluate method, of class SubstractionOperation.
     */
    @Test
    public void testEvaluate() {
        INumber left = new Number(8);
        INumber right = new Number(5);
        
        SubstractionOperation instance = new SubstractionOperation();
        
        INumber expResult = new Number(3);
        
        INumber result = instance.evaluate(left, right);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getOperationDescription method, of class SubstractionOperation.
     */
    @Test
    public void testGetOperationDescription() {
        INumber left = new Number(2);
        INumber right = new Number(1);
        
        SubstractionOperation instance = new SubstractionOperation();
        
        INumber expResult = new Number(2);
        
        INumber result = instance.evaluate(left, right);
        
        assertNotEquals(expResult, result);
    }
    
}
