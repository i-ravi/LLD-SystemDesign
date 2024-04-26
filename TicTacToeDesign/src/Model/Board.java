/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

/**
 *
 * @author ravisharma
 */
public class Board {
    public int size;
    public PlayingPiece[][] board;
    
    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int inputRow, int inputColumn, PlayingPiece piece) {
        if (board[inputRow][inputColumn] != null){
            return false;
        }
        board[inputRow][inputColumn] = piece;
        return true;
    }
    
    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for(int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (board[i][j] == null){
                    freeCells.add(new Pair<>(i,j));
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                System.out.print((board[i][j] != null ? board[i][j].type : " ") + "|");
            }
            System.out.println("");
        }
    }
    
}
