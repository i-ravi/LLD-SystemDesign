/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

/**
 *
 * @author ravisharma
 */
public class VegDelight extends BasePizza{
    int prize = 300;
    @Override
    public int cost() {
        System.out.println("VegDelight Pizza : " + prize);
        return prize;
    }
    
}
