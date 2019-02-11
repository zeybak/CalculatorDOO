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
    protected IUI uiModule;
    protected IArithmetics arithmeticsModule;
    
    public Calculator()
    {
        this.uiModule = new UI(this);
        this.arithmeticsModule = new Arithmetics();
    }

    @Override
    public void onNumberInputEvent(String number) {
        this.arithmeticsModule.addNumber(number);
        this.uiModule.display(this.arithmeticsModule.getOperand());
    }

    @Override
    public void onDecimalInputEvent() {
        this.arithmeticsModule.addDecimal();
        this.uiModule.display(this.arithmeticsModule.getOperand());
    }

    @Override
    public void onOperaitonInputEvent(IOperation operation) {
        this.arithmeticsModule.setOperation(operation);
        this.uiModule.displayOperation(this.arithmeticsModule.getOperation());
        this.uiModule.display("");
    }

    @Override
    public void onQuitInputEvent() {
        System.exit(0);
    }

    @Override
    public void onClearInputEvent() {
        this.arithmeticsModule.clear();
        this.uiModule.clear();
    }

    @Override
    public void onEqualsInputEvent() {
        this.uiModule.displayOperation("");
        this.uiModule.display(this.arithmeticsModule.calculate().toString());
    }
}
