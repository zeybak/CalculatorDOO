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
    protected Boolean completed;
    
    public Number() {
        this.number = "";
        this.completed = false;
    }
    
    public Number(String value) {
        this.number = value;
        this.completed = false;
    }
    
    public Number(float value) {
        setValue(value);
        this.completed = false;
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

    @Override
    public void setCompleted() {
        this.completed = true;
    }

    @Override
    public Boolean isCompleted() {
        return this.completed;
    }
}
