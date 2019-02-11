/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 *
 * @author mauro
 */
public abstract class UIButton implements IUIElement {
    protected JButton button;
    
    public UIButton() {
        this.button = new JButton();
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                onButtonClicked();
            }
        });
    }
    
    public UIButton(String label) {
        this.button = new JButton(label);
        this.button.setText(label);
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                onButtonClicked();
            }
        });
    }
    
    @Override
    public JComponent getComponent() {
        return this.button;
    }
    
    protected abstract void onButtonClicked();
}
