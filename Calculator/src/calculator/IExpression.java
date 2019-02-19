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
public interface IExpression {
    public void addOperand(INumber number);
    public void setOperation(IOperation operation);
    public INumber evaluate();
    public String getDescription();
}
