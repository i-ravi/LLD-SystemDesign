/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author ravisharma
 */
public class Number implements ArithmeticExpression{

    int value;
    public Number(int value){this.value = value;}
    
    @Override
    public int evaluate() {
        return this.value;
    }
    
}
