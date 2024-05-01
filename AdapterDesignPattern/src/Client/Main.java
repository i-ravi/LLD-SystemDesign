/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Adaptee.*;
import Adapter.*;

/**
 *
 * @author ravisharma
 */
public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter adapter = new WeightMachineAdapterImplementation(new WeightMachineForBabies());
        System.out.println(adapter.getWeightInKg());
    }
}
