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
public interface IUI {
    public void display(String label);
    public void displayOperation(String label);
    public void displayHistory(String[] labels);
    public void clear();
}
