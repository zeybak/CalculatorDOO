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
public class Arithmetics implements IArithmetics {
    protected IExpression currentExpression;
    protected INumber currentOperand;
    
    public Arithmetics() {
        this.currentExpression = new Expression();
    }
    
    @Override
    public void addNumber(String number) {
        if (this.currentExpression.isCompleted()) {
            this.currentExpression = new Expression();
        }
        if (this.currentOperand == null) {
            this.currentOperand = new Number();
        }
        this.currentOperand.addNumber(number);
    }

    @Override
    public void addDecimal() {
        if (this.currentExpression.isCompleted()) {
            this.currentExpression = new Expression();
        }
        if (this.currentOperand == null) {
            this.currentOperand = new Number();
        }
        this.currentOperand.addDecimal();
    }

    @Override
    public void setOperation(IOperation operation) {
        if (this.currentOperand != null) {
            this.currentExpression.addOperand(currentOperand);
        }
        
        INumber oldExpressionResult = calculate();
        this.currentExpression = new Expression();
        this.currentExpression.addOperand(oldExpressionResult);
        
        this.currentOperand = null;
        this.currentExpression.setOperation(operation);
    }

    @Override
    public void clear() {
        this.currentExpression = new Expression();
        this.currentOperand = null;
    }

    @Override
    public INumber calculate() {
        if (this.currentOperand != null) {
            this.currentExpression.addOperand(currentOperand);
        }
        this.currentOperand = null;
        
        INumber result = this.currentExpression.evaluate();
        this.currentExpression.setCompleted();
        return result;
    }

    @Override
    public String getOperation() {
        return this.currentExpression.getDescription();
    }

    @Override
    public String getOperand() {
        if (this.currentOperand == null) {
            return "0";
        }
        
        return this.currentOperand.toString();
    }
}
