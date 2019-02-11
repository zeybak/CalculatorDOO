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
    
    public Arithmetics() {
        this.operands = new ArrayList<>();
    }
    
    @Override
    public void addNumber(String number) {
        if (this.operands.isEmpty()) {
            createNumber(number);
        }
        else {
            this.operands.get(this.operands.size() - 1).addNumber(number);
        }
    }

    @Override
    public void addDecimal() {
        if (this.operands.isEmpty()) {
            INumber number = createNumber("0");
            number.addDecimal();
        }
        else {
            this.operands.get(this.operands.size() - 1).addDecimal();
        }
    }

    @Override
    public void setOperation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        this.operands.clear();
    }

    @Override
    public void calculate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOperation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    private INumber createNumber(String value) {
        Number number = new Number();
        number.addNumber(value);
        this.operands.add(number);
        return number;
    }
}
