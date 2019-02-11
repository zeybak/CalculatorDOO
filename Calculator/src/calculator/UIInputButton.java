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
public abstract class UIInputButton extends UIButton {
    protected ArrayList<IInputListener> listeners;
    
    public UIInputButton() {
        super();
        this.listeners = new ArrayList<>();
    }
    
    public UIInputButton(String label) {
        super(label);
        this.listeners = new ArrayList<>();
    }
    
    public void addListener(IInputListener listener) {
        this.listeners.add(listener);
    }
    
    @Override
    protected void onButtonClicked() {
        for (int i = 0; i < this.listeners.size(); i++) {
            callListenerFunction(this.listeners.get(i));
        }
    }
    
    protected abstract void callListenerFunction(IInputListener listener);
}
