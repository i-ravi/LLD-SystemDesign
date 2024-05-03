
import VendingMachine.*;
import VendingMachine.State.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravisharma
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine machine  = new VendingMachine();
        try{
            System.out.println("|");
            System.out.println("Filling the inventory");
            System.out.println("|");
            
            fillUpInventory(machine);
            displayInventory(machine);
            
            System.out.println("|");
            System.out.println("Clicking on Insert Coin Button");
            System.out.println("|");
            
            State vendingMachineState = machine.getVendingMachineState();
            vendingMachineState.clickOnInsertCoinButton(machine);
            
            vendingMachineState = machine.getVendingMachineState();
            vendingMachineState.insertCoin(machine, Coin.NICKEL);
            vendingMachineState.insertCoin(machine, Coin.QUARTER);
            
            System.out.println("|");
            System.out.println("Clicking on Product Selection Button");
            System.out.println("|");
            
            vendingMachineState.clickOnStartProductSelectionButton(machine);
            
            vendingMachineState = machine.getVendingMachineState();
            vendingMachineState.chooseProduct(machine, 102);
            displayInventory(machine);
        } catch (Exception ex){
            displayInventory(machine);
        }
    }

    private static void fillUpInventory(VendingMachine machine) {
        ItemShelf[] slots = machine.getInventory().getInventory();
        for (int i=0; i< slots.length; i++){
            Item newItem = new Item();
            if (i>=0 && i<3){
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            }
            else if (i>=3 && i<5){
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(9);
            }
            else if (i>=5 && i<7){
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(13);
            }
            else if(i>=7){
                newItem.setType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine machine) {
        ItemShelf[] slots = machine.getInventory().getInventory();
        for (int i=0; i<slots.length; i++){
            System.out.println("Code Number: " + slots[i].getCode()
                    + " Item: " + slots[i].getItem().getType().name()
                    + " Price: " + slots[i].getItem().getPrice()
                    + " isAvailable: " + !slots[i].isSoldOut());
        }
    }
}
