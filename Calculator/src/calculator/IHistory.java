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
public interface IHistory {
    public void addToTemporalData(IRetrievable data);
    public void addToFinalData(IRetrievable data);
    public IRetrievable restoreFromTemporalData();
    public IRetrievable restoreFromFinalData();
    public IRetrievable[] getFinalData();
}
