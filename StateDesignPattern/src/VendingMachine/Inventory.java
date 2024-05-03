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
public class Inventory {
    ItemShelf[] inventory = null;
    
    Inventory(int itemCount){
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    private void initialEmptyInventory() {
        int startCode = 101;
        for (int i=0; i<inventory.length; i++){
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i] = space;
            startCode++;
        }
    }
    
    public void addItem(Item item, int codeNumber) throws Exception{
        for (ItemShelf itemShelf : inventory){
            if (itemShelf.getCode() == codeNumber){
                if (itemShelf.isSoldOut()){
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("item is already present, you cannot add item here");
                }
            }
        }
    }
    
    public ItemShelf[] getInventory(){
        return this.inventory;
    }
    
    public void setInventory(ItemShelf[] inventory){
        this.inventory = inventory;
    }
    
    public Item getItem(int codeNumber) throws Exception{
        for (ItemShelf itemShelf : inventory){
            if (itemShelf.getCode() == codeNumber){
                if (itemShelf.isSoldOut()){
                    throw new Exception("item is already soldout");
                } else {
                    return itemShelf.getItem();
                }
            }
        }
        return null;
    }

    public void updateSoldOutItem(int codeNumber) {
        for (ItemShelf itemShelf : inventory){
            if (itemShelf.getCode() == codeNumber){
                itemShelf.setSoldOut(true);
            }
        }
    }
    
}
