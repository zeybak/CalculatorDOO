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
public interface IArithmetics {
    public void addNumber(String number);
    public void addDecimal();
    public void setOperation(IOperation operation);
    public void clear();
    public INumber calculate();
    public String getOperation();
    public String getOperand();
}
