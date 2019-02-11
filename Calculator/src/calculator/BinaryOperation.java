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
public abstract class BinaryOperation implements IOperation {
    @Override
    public INumber evaluate(INumber[] numbers) {
        if (numbers.length >= getOperandsNeeded()) {
            return evaluate(numbers[0], numbers[1]);
        }
        if (numbers.length > 0) {
            return numbers[0];
        }
        return new Number(0);
    }
    
    protected abstract INumber evaluate(INumber left, INumber right);
    
    @Override
    public String getOperationDescription(INumber[] numbers) {
        String operationDescription = "";
        if (numbers.length > 0) {
            operationDescription += numbers[0].toString() + " " + getOperationDescription() + " ";
            if (numbers.length > 1) {
                operationDescription += numbers[1];
            }
        }
        return operationDescription;
    }
    
    protected abstract String getOperationDescription();
    
    @Override
    public int getOperandsNeeded() {
        return 2;
    }
}
