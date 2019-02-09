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
public class UIDecimalButton extends UIInputButton {
    public UIDecimalButton(String label) {
        super(label);
    }
    
    @Override
    protected void callListenerFunction(IInputListener listener) {
        listener.onDecimalInputEvent();
    }
}
