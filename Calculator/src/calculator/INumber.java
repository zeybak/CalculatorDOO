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
public interface INumber {
    public void addNumber(String number);
    public void addDecimal();
    public void setValue(float value);
    public float getValue();
    @Override
    public String toString();
    @Override
    public boolean equals(Object other);
}
