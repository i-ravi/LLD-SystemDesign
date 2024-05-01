/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine.State;

import VendingMachine.Coin;
import VendingMachine.Item;
import VendingMachine.VendingMachine;
import java.util.List;

/**
 *
 * @author ravisharma
 */
public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Currently Vending Machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you cannot click on insert coin button in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("wo cannot insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        
        // get item of this code number
        Item item = machine.getInventory().getItem(codeNumber);
        
        //2. total amount paid by user
        int paidByUser = 0;
        for (Coin coin : machine.getCoinList()){
            paidByUser += coin.value;
        }
        
        //3. compare product price and amount paid by user
        if (paidByUser < item.getPrice()){
            System.out.println("Insufficient Amount, PRoduct you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        } else if (paidByUser >= item.getPrice()){
            if (paidByUser > item.getPrice()){
                getChange(paidByUser - item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // actual logic should be return coins in the dispense tray, but for simplicity just returnin amount
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product cannot be dispence in selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory cannot be updated in selection state"); //To change body of generated methods, choose Tools | Templates.
    }

    
}
