/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static java.lang.Integer.parseInt;

/**
 *
 * @author mauro
 */
public class UINumericButton extends UIInputButton {
    public UINumericButton(String label) {
        super(label);
    }
    
    @Override
    protected void callListenerFunction(IInputListener listener) {
        listener.onNumberInputEvent(parseInt(this.button.getText()));
    }
}
