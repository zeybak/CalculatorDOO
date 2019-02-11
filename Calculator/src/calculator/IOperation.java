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
public interface IOperation {
    public INumber evaluate(INumber[] numbers);
    public String getOperationDescription(INumber[] numbers);
    public int getOperandsNeeded();
}
