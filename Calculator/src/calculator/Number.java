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
public class Number implements INumber {
    protected String number;
    
    public Number() {
        this.number = "";
    }
    
    @Override
    public void addNumber(String number) {
        this.number += number;
    }
    
    @Override
    public void addDecimal() {
        if (!this.number.contains(".")) {
            this.number += ".";
        }
    }
    
    @Override
    public void setValue(float value) {
        this.number = Float.toString(value);
    }
    
    @Override
    public float getValue() {
        return Float.parseFloat(this.number);
    }
    
    @Override
    public String toString() {
        return this.number;
    }
}
