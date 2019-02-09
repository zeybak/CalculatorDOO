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
public class Calculator implements IInputListener {
    private IUI uiModule;
    
    public Calculator()
    {
        this.uiModule = new UI();
        this.uiModule.build();
    }

    @Override
    public void onNumberInputEvent(int number) {
    }

    @Override
    public void onDecimalInputEvent() {
    }

    @Override
    public void onOperaitonInputEvent() {
    }

    @Override
    public void onQuitInputEvent() {
    }

    @Override
    public void onClearInputEvent() {
    }

    @Override
    public void onEqualsInputEvent() {
    }
}
