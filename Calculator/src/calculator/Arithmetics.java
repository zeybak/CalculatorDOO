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
public class Arithmetics implements IArithmetics {
    protected ArrayList<INumber> operands;
    protected IOperation operation;
    
    public Arithmetics() {
        this.operands = new ArrayList<>();
    }
    
    @Override
    public void addNumber(String number) {
        if (this.operands.isEmpty() || this.operands.get(this.operands.size() - 1).isCompleted()) {
            createNumber(number);
        }
        else {
            this.operands.get(this.operands.size() - 1).addNumber(number);
        }
    }

    @Override
    public void addDecimal() {
        if (this.operands.isEmpty()) {
            createNumber("0");
        }
        else if (this.operands.get(this.operands.size() - 1).isCompleted()) {
            createNumber("0");
        }
        this.operands.get(this.operands.size() - 1).addDecimal();
    }

    @Override
    public void setOperation(IOperation operation) {
        if (this.operands.size() > 0) {
            this.operation = operation;
            this.operands.get(this.operands.size() - 1).setCompleted();
        }
    }

    @Override
    public void clear() {
        this.operands.clear();
        this.operation = null;
    }

    @Override
    public INumber calculate() {
        INumber number = new Number();
        if (this.operation != null) {
            number.setValue(this.operation.evaluate(operandsAsArray()).getValue());
            clear();
            this.operands.add(number);
        }
        return number;
    }

    @Override
    public String getOperation() {
        if (this.operation != null) {
            return this.operation.getOperationDescription(operandsAsArray());
        }
        else {
            return "";
        }
    }

    @Override
    public String getOperand() {
        if (this.operands.isEmpty()) {
            return "";
        }
        else {
            return this.operands.get(this.operands.size() - 1).toString();
        }
    }
    
    private void createNumber(String value) {
        Number number = new Number(value);
        this.operands.add(number);
    }
    
    private INumber[] operandsAsArray() {
        INumber[] operandsArray = new INumber[this.operands.size()];
        operandsArray = this.operands.toArray(operandsArray);
        return operandsArray;
    }
}
