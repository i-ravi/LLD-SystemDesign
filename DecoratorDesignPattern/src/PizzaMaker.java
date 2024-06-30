
import Decorator.*;
import Pizza.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravisharma
 */
public class PizzaMaker {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraCheese(new Margherita());
        System.out.println("Total : " + pizza1.cost());
        
        BasePizza pizza2 = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println("Total : " + pizza2.cost());
    }
}
