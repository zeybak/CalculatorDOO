/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mauro
 */
public class AdditionOperationTest {

    /**
     * Test of evaluate method, of class AdditionOperation.
     */
    @Test
    public void testEvaluate() {
        INumber left = new Number(6);
        INumber right = new Number(7);
        
        AdditionOperation instance = new AdditionOperation();
        
        INumber expResult = new Number(13);
        
        INumber result = instance.evaluate(left, right);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEvaluateError() {
        INumber left = new Number(6);
        INumber right = new Number(1);
        
        AdditionOperation instance = new AdditionOperation();
        
        INumber expResult = new Number(6);
        
        INumber result = instance.evaluate(left, right);
        
        assertNotEquals(expResult, result);
    }
    
}
