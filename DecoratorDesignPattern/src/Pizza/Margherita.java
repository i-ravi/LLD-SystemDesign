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
public class Margherita extends BasePizza {

    @Override
    public int cost() {
        System.out.println("Magherita Pizza : " + 100);
        return 100;
    }
    
}
