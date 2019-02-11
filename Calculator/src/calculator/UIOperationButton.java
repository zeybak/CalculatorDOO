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
public class UIOperationButton extends UIInputButton {
    protected IOperation operation;
    
    public UIOperationButton(String label) {
        super(label);
    }
    
    public UIOperationButton(String label, IOperation operation) {
        super(label);
        this.operation = operation;
    }
    
    @Override
    protected void callListenerFunction(IInputListener listener) {
        listener.onOperaitonInputEvent(this.operation);
    }
}
