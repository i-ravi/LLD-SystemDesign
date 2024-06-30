/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Pizza.BasePizza;

/**
 *
 * @author ravisharma
 */
public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;
    
    public Mushroom(BasePizza pizza){
        this.basePizza = pizza;
    }
    
    @Override
    public int cost() {
        System.out.println("Has Mushroom: " + 20);
        return this.basePizza.cost() + 20;
    }
    
}
