/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author mauro
 */
public class UILabel implements IUIElement, IUILabel{
    protected JLabel label;
    
    public UILabel() {
        this.label = new JLabel();
    }
    
    public UILabel(String label) {
        this.label = new JLabel(label);
    }
    
    public JComponent getComponent() {
        return this.label;
    }
    
    public void setText(String text) {
        this.label.setText(text);
    }
    
    public String getText() {
        return this.label.getText();
    }
}
