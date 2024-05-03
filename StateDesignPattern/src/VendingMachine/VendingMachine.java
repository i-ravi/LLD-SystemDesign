/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine;

import VendingMachine.State.*;
import java.util.*;

/**
 *
 * @author ravisharma
 */
public class VendingMachine {
    
    private State vendindMachineState;
    private Inventory inventory;
    private List<Coin> coinList;
    
    public VendingMachine(){
        this.vendindMachineState = new IdleState();
        this.inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }
    
    public State getVendingMachineState() {
        return this.vendindMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendindMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
    
    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return this.coinList;
    }
    
    public void setCointList(ArrayList coinList) {
        this.coinList = coinList;
    }
}
