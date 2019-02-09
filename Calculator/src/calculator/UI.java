/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.GroupLayout;
import javax.swing.JFrame;

/**
 *
 * @author mauro
 */
public class UI implements IUI {
    private IUILabel label;
    
    public void build()
    {
        JFrame calculatorUI = new JFrame("UBP: Object Oriented Design - Calculator");
        
        this.label = new UILabel();
        UIButton additionButton = new UIOperationButton("+");
        UIButton substractionButton = new UIOperationButton("-");
        UIButton multiplicationButton = new UIOperationButton("*");
        UIButton divisionButton = new UIOperationButton("/");
        UIButton resultButton = new UIResultButton("=");
        UIButton[] numbersButtons = new UIButton[10];
        for (Integer i = 0; i < numbersButtons.length; i++)
        {
            numbersButtons[i] = new UINumericButton(i.toString());
        }
        UIButton decimalButton = new UIDecimalButton(".");
        UIButton clearButton = new UIClearButton("C");
        
        GroupLayout layout = new GroupLayout(calculatorUI.getContentPane());
        calculatorUI.setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);
        
        GroupLayout.ParallelGroup firstColumn = layout.createParallelGroup();
        firstColumn.addComponent(this.label.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        firstColumn.addComponent(numbersButtons[7].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        firstColumn.addComponent(numbersButtons[4].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        firstColumn.addComponent(numbersButtons[1].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup secondColumn = layout.createParallelGroup();
        secondColumn.addComponent(this.label.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(clearButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(numbersButtons[8].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(numbersButtons[5].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(numbersButtons[2].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(numbersButtons[0].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup thirdColumn = layout.createParallelGroup();
        thirdColumn.addComponent(this.label.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdColumn.addComponent(numbersButtons[9].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdColumn.addComponent(numbersButtons[6].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdColumn.addComponent(numbersButtons[3].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdColumn.addComponent(decimalButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup fourthColumn = layout.createParallelGroup();
        fourthColumn.addComponent(this.label.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(divisionButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(multiplicationButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(substractionButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(additionButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(resultButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup firstRow = layout.createParallelGroup();
        firstRow.addComponent(clearButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        firstRow.addComponent(divisionButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup secondRow = layout.createParallelGroup();
        secondRow.addComponent(numbersButtons[7].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondRow.addComponent(numbersButtons[8].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondRow.addComponent(numbersButtons[9].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondRow.addComponent(multiplicationButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup thirdRow = layout.createParallelGroup();
        thirdRow.addComponent(numbersButtons[4].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdRow.addComponent(numbersButtons[5].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdRow.addComponent(numbersButtons[6].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdRow.addComponent(substractionButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup fourthRow = layout.createParallelGroup();
        fourthRow.addComponent(numbersButtons[1].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthRow.addComponent(numbersButtons[2].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthRow.addComponent(numbersButtons[3].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthRow.addComponent(additionButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup fifthRow = layout.createParallelGroup();
        fifthRow.addComponent(numbersButtons[0].getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fifthRow.addComponent(decimalButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fifthRow.addComponent(resultButton.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(firstColumn)
                .addGroup(secondColumn)
                .addGroup(thirdColumn)
                .addGroup(fourthColumn)
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(this.label.getComponent(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(firstRow)
                .addGroup(secondRow)
                .addGroup(thirdRow)
                .addGroup(fourthRow)
                .addGroup(fifthRow)
        );
        
        calculatorUI.setSize(400,500);
        calculatorUI.setVisible(true);
    }
}
