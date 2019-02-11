/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author mauro
 */
public class UILabel implements IUIElement, IUILabel{
    protected JLabel label;
    
    public UILabel() {
        this.label = new JLabel("");
        this.label.setHorizontalAlignment(SwingConstants.RIGHT);
    }
    
    public UILabel(String label) {
        this.label = new JLabel(label);
        this.label.setHorizontalAlignment(SwingConstants.RIGHT);
    }
    
    @Override
    public JComponent getComponent() {
        return this.label;
    }
    
    @Override
    public void setText(String text) {
        this.label.setText(text);
    }
    
    @Override
    public String getText() {
        return this.label.getText();
    }
}
