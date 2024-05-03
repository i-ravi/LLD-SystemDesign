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
public class Item {
    ItemType type;
    int price;

    public int getPrice() {
        return price;
    }
    
    public ItemType getType(){
        return type;
    }
    
    public void setType(ItemType type){
        this.type = type;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
}
