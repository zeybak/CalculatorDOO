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
    protected IHistory historyModule;
    
    public Calculator()
    {
        this.uiModule = new UI(this);
        this.arithmeticsModule = new Arithmetics();
        this.historyModule = new History();
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
        String result = this.arithmeticsModule.calculate().toString();
        this.uiModule.display(result);
        
        if (result != "") {
            this.historyModule.addToFinalData(new CalculationData(result));
            IRetrievable[] history = this.historyModule.getFinalData();
            String[] historyAsString = new String[history.length];
            for (int i = 0; i < history.length; i++) {
                if (history[i].getRetrievableData()[0] instanceof String) {
                    historyAsString[i] = (String)history[i].getRetrievableData()[0];
                }
            }
            this.uiModule.displayHistory(historyAsString);
        }
    }
}
