/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ravisharma
 */
public class Player {
    public String name;
    public PlayingPiece playingPiece;
    
    public Player(String name, PlayingPiece piece){
        this.name = name;
        this.playingPiece = piece;
    }
}
