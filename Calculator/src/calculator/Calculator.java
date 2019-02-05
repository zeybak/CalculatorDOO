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
    private IUI uiModule;
    
    public void build()
    {
        this.uiModule = new UI();
        this.uiModule.build();
    }
}
