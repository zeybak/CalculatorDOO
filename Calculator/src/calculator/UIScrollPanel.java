/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

/**
 *
 * @author mauro
 */
public class UIScrollPanel implements IUIElement, IUIScrollablePanel{
    protected JScrollPane jScrollPanel;
    protected JList jList;
    protected DefaultListModel elementsList;
    
    public UIScrollPanel() {
        this.jScrollPanel = new JScrollPane();
        this.elementsList = new DefaultListModel();
        this.jList = new JList(this.elementsList);
        
        DefaultListCellRenderer renderer = (DefaultListCellRenderer) this.jList.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        this.jScrollPanel.setViewportView(this.jList);
    }
    
    @Override
    public JComponent getComponent() {
        return this.jScrollPanel;
    }

    @Override
    public void clear() {
        this.elementsList.clear();
    }

    @Override
    public void setElements(String[] elements) {
        clear();
        for (String element : elements) {
            this.elementsList.insertElementAt(element, 0);
        }
        this.jScrollPanel.revalidate();
        this.jScrollPanel.repaint();
    }
}
