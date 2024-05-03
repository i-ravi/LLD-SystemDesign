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
public class ItemShelf {
    private int code;
    private Item item;
    private boolean soldOut;
    
    public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    public Item getItem(){
        return item;
    }
    
    public void setItem(Item item){
        this.item = item;
    }
    
    public boolean isSoldOut(){
        return soldOut;
    }
    
    public void setSoldOut(boolean soldOut){
        this.soldOut = soldOut;
    }
}
