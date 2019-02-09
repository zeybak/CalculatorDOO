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
public interface IInputListener {
    public void onNumberInputEvent(int number);
    public void onDecimalInputEvent();
    public void onOperaitonInputEvent();
    public void onEqualsInputEvent();
    public void onQuitInputEvent();
    public void onClearInputEvent();
}
