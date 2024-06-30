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
public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;
    
    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }
    
    @Override
    public int cost() {
        System.out.println("Has ExtraCheese : " + 10);
        return this.basePizza.cost() + 10;
    }
    
}
