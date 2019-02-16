/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class History implements IHistory {
    protected ArrayList<IRetrievable> finalData;
    protected ArrayList<IRetrievable> temporalData;
    
    public History() {
        this.finalData = new ArrayList<>();
        this.temporalData = new ArrayList<>();
    }

    @Override
    public void addToTemporalData(IRetrievable data) {
        this.temporalData.add(data);
    }

    @Override
    public void addToFinalData(IRetrievable data) {
        this.finalData.add(data);
    }

    @Override
    public IRetrievable restoreFromTemporalData() {
        if (this.temporalData.size() <= 0) {
            return null;
        }
        IRetrievable data = this.temporalData.get(this.temporalData.size() - 1);
        this.temporalData.remove(data);
        return data;
    }

    @Override
    public IRetrievable restoreFromFinalData() {
        if (this.finalData.size() <= 0) {
            return null;
        }
        IRetrievable data = this.finalData.get(this.finalData.size() - 1);
        this.finalData.remove(data);
        return data;
    }

    @Override
    public IRetrievable[] getFinalData() {
        IRetrievable data[] = new IRetrievable[this.finalData.size()];
        data = this.finalData.toArray(data);
        return data;
    }
    
}
