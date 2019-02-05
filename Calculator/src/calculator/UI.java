/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mauro
 */
public class UI implements IUI {
    public void build()
    {
        JFrame calculatorUI = new JFrame("UBP: Object Oriented Design - Calculator");
        
        JLabel resultLabel = new JLabel();
        JButton additionButton = new JButton("+");
        JButton substractionButton = new JButton("-");
        JButton multiplicationButton = new JButton("*");
        JButton divisionButton = new JButton("/");
        JButton resultButton = new JButton("=");
        JButton[] numbersButtons = new JButton[10];
        for (Integer i = 0; i < numbersButtons.length; i++)
        {
            numbersButtons[i] = new JButton(i.toString());
        }
        JButton decimalButton = new JButton(".");
        JButton clearButton = new JButton("C");
        
        
        GroupLayout layout = new GroupLayout(calculatorUI.getContentPane());
        calculatorUI.setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);
        
        GroupLayout.ParallelGroup firstColumn = layout.createParallelGroup();
        firstColumn.addComponent(resultLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        firstColumn.addComponent(numbersButtons[7], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        firstColumn.addComponent(numbersButtons[4], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        firstColumn.addComponent(numbersButtons[1], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup secondColumn = layout.createParallelGroup();
        secondColumn.addComponent(resultLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(clearButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(numbersButtons[8], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(numbersButtons[5], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(numbersButtons[2], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondColumn.addComponent(numbersButtons[0], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup thirdColumn = layout.createParallelGroup();
        thirdColumn.addComponent(resultLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdColumn.addComponent(numbersButtons[9], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdColumn.addComponent(numbersButtons[6], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdColumn.addComponent(numbersButtons[3], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdColumn.addComponent(decimalButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup fourthColumn = layout.createParallelGroup();
        fourthColumn.addComponent(resultLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(divisionButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(multiplicationButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(substractionButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(additionButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthColumn.addComponent(resultButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup firstRow = layout.createParallelGroup();
        firstRow.addComponent(clearButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        firstRow.addComponent(divisionButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup secondRow = layout.createParallelGroup();
        secondRow.addComponent(numbersButtons[7], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondRow.addComponent(numbersButtons[8], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondRow.addComponent(numbersButtons[9], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        secondRow.addComponent(multiplicationButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup thirdRow = layout.createParallelGroup();
        thirdRow.addComponent(numbersButtons[4], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdRow.addComponent(numbersButtons[5], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdRow.addComponent(numbersButtons[6], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        thirdRow.addComponent(substractionButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup fourthRow = layout.createParallelGroup();
        fourthRow.addComponent(numbersButtons[1], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthRow.addComponent(numbersButtons[2], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthRow.addComponent(numbersButtons[3], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fourthRow.addComponent(additionButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        GroupLayout.ParallelGroup fifthRow = layout.createParallelGroup();
        fifthRow.addComponent(numbersButtons[0], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fifthRow.addComponent(decimalButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        fifthRow.addComponent(resultButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(firstColumn)
                .addGroup(secondColumn)
                .addGroup(thirdColumn)
                .addGroup(fourthColumn)
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(resultLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
