/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine;

/**
 *
 * @author ravisharma
 */
public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);
    
    public int value;
    
    Coin(int value){
        this.value = value;
    }
}
