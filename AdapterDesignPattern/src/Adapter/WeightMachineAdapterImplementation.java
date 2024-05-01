/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Adaptee.*;

/**
 *
 * @author ravisharma
 */
public class WeightMachineAdapterImplementation implements WeightMachineAdapter {
    WeightMachine machine;
    public WeightMachineAdapterImplementation(WeightMachine machine){
        this.machine = machine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = machine.getWeightInPounds();
        
        double weightInKG = weightInPound * 0.45;
        return weightInKG;
    }
    
    
}
