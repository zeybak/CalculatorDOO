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
public class SubstractionOperation extends BinaryOperation {
    @Override
    protected INumber evaluate(INumber left, INumber right) {
        return new Number(left.getValue() - right.getValue());
    }

    @Override
    protected String getOperationDescription() {
        return "-";
    }
}
