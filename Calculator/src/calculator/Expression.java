/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class Expression implements IExpression {
    protected ArrayList<INumber> operands;
    protected IOperation operation;
    
    public Expression() {
        this.operands = new ArrayList<>();
    }
    
    @Override
    public void addOperand(INumber number) {
        this.operands.add(number);
    }

    @Override
    public void setOperation(IOperation operation) {
        if (this.operands.size() > 0) {
            this.operation = operation;
        }
    }

    @Override
    public INumber evaluate() {
        if (this.operation != null) {
            return this.operation.evaluate(operandsAsArray());
        }
        if (this.operands.size() > 0) {
            return this.operands.get(0);
        }
        return new Number();
    }

    @Override
    public String getDescription() {
        if (this.operation != null) {
            return this.operation.getOperationDescription(operandsAsArray());
        }
        return "";
    }
    
    private INumber[] operandsAsArray() {
        INumber[] operandsArray = new INumber[this.operands.size()];
        operandsArray = this.operands.toArray(operandsArray);
        return operandsArray;
    }
}
