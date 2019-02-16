/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.JFrame;

/**
 *
 * @author mauro
 */
public class UI implements IUI {
    protected IUILabel operation;
    protected IUILabel result;
    protected IUIScrollablePanel history;
    
    public UI(IInputListener listener) {
        JFrame calculatorUI = new JFrame("UBP: Object Oriented Design - Calculator");
        calculatorUI.setSize(400,500);
        calculatorUI.setVisible(true);
        
        LayoutBuilder layoutBuilder = new LayoutBuilder(calculatorUI.getContentPane(), 4, 7);
        
        createDisplays(layoutBuilder);
        createOperations(layoutBuilder, listener);
        createNumbers(layoutBuilder, listener);
        
        layoutBuilder.generateLayout();
        
        calculatorUI.setLayout(layoutBuilder.getLayout());
        calculatorUI.pack();
        
        JFrame historyUI = new JFrame("UBP: Object Oriented Design - History");
        historyUI.setSize(400,500);
        historyUI.setLocation(400, 0);
        historyUI.setVisible(true);
        
        this.history = new UIScrollPanel();
        historyUI.add(this.history.getComponent());
        historyUI.pack();
    }
    
    @Override
    public void display(String label) {
        this.result.setText(label);
    }
    
    @Override
    public void displayOperation(String label) {
        this.operation.setText(label);
    }
    
    @Override
    public void clear() {
        this.result.setText("");
        this.operation.setText("");
    }
    
    private void createDisplays(LayoutBuilder builder) {
        this.operation = new UILabel();
        builder.addLayoutElement(this.operation.getComponent(), 3, 0);
        
        this.result = new UILabel();
        builder.addLayoutElement(this.result.getComponent(), 3, 1);
    }
    
    private void createOperations(LayoutBuilder builder, IInputListener listener) {
        UIInputButton offButton = new UIOffButton("OFF");
        offButton.addListener(listener);
        builder.addLayoutElement(offButton.getComponent(), 0, 2);
        
        UIInputButton clearButton = new UIClearButton("C");
        clearButton.addListener(listener);
        builder.addLayoutElement(clearButton.getComponent(), 1, 2);
        
        UIInputButton divisionButton = new UIOperationButton("/", new DivisionOperation());
        divisionButton.addListener(listener);
        builder.addLayoutElement(divisionButton.getComponent(), 3, 2);
        
        UIInputButton multiplicationButton = new UIOperationButton("*", new MultiplicationOperation());
        multiplicationButton.addListener(listener);
        builder.addLayoutElement(multiplicationButton.getComponent(), 3, 3);
        
        UIInputButton substractionButton = new UIOperationButton("-", new SubstractionOperation());
        substractionButton.addListener(listener);
        builder.addLayoutElement(substractionButton.getComponent(), 3, 4);
        
        UIInputButton additionButton = new UIOperationButton("+", new AdditionOperation());
        additionButton.addListener(listener);
        builder.addLayoutElement(additionButton.getComponent(), 3, 5);
        
        UIInputButton resultButton = new UIResultButton("=");
        resultButton.addListener(listener);
        builder.addLayoutElement(resultButton.getComponent(), 3, 6);
    }
    
    private void createNumbers(LayoutBuilder builder, IInputListener listener) {
        UIInputButton decimalButton = new UIDecimalButton(".");
        decimalButton.addListener(listener);
        builder.addLayoutElement(decimalButton.getComponent(), 2, 4);
        
        int buttonColumn = 0;
        int buttonRow = 5;
        UIInputButton[] numbersButtons = new UIInputButton[10];
        numbersButtons[0] = new UINumericButton("0");
        numbersButtons[0].addListener(listener);
        builder.addLayoutElement(numbersButtons[0].getComponent(), 1, 6);
        for (Integer i = 1; i < numbersButtons.length; i++)
        {
            numbersButtons[i] = new UINumericButton(i.toString());
            numbersButtons[i].addListener(listener);
            builder.addLayoutElement(numbersButtons[i].getComponent(), buttonColumn, buttonRow);
            buttonColumn++;
            if (buttonColumn > 2) {
                buttonColumn = 0;
                buttonRow--;
            }
        }
    }

    @Override
    public void displayHistory(String[] labels) {
        this.history.setElements(labels);
    }
}
