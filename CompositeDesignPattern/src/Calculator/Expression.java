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
public class Expression implements ArithmeticExpression {
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;
    
    public Expression(ArithmeticExpression left, ArithmeticExpression right, Operation op){
        this.leftExpression = left;
        this.rightExpression = right;
        this.operation = op;
    }
    
    @Override
    public int evaluate() {
        int value = 0;
        switch(this.operation){
            case ADD:
                value = this.leftExpression.evaluate() + this.rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = this.leftExpression.evaluate() - this.rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = this.leftExpression.evaluate() * this.rightExpression.evaluate();
                break;
            case DIVIDE:
                value = this.leftExpression.evaluate() / this.rightExpression.evaluate();
                break;
        }
        return value;
    }
    
}
