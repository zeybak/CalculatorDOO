/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Objects;

/**
 *
 * @author mauro
 */
public class Number implements INumber {
    protected String number;
    
    public Number() {
        this.number = "0";
    }
    
    public Number(String value) {
        this.number = value;
    }
    
    public Number(float value) {
        setValue(value);
    }
    
    @Override
    public void addNumber(String number) {
        if (this.number == "0") {
            this.number = number;
        }
        else {
            this.number += number;
        }
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
        this.number = this.number.replace(".0", "");
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
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof INumber)) return false;
        INumber otherNumber = (INumber) other;
        return otherNumber.getValue() == getValue();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.number);
        return hash;
    }
}
