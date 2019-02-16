/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author mauro
 */
public class CalculationData implements IRetrievable {

    protected String result;
    
    public CalculationData(String result) {
        this.result = result;
    }
    
    @Override
    public Object[] getRetrievableData() {
        Object[] dataToRetrieve = new Object[1];
        dataToRetrieve[0] = result;
        return dataToRetrieve;
    }
    
}
