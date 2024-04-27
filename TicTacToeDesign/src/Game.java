/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Model.*;
import java.util.*;
import javafx.util.Pair;

/**
 *
 * @author ravisharma
 */
public class Game {
    Board gameBoard;
    Deque<Player> players;
    
    Game(){ initializeGame();}
    
    public void initializeGame(){
        // creating players
        players = new LinkedList<>();
        
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);
        
        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);
        
        players.add(player1);
        players.add(player2);
        
        // new board
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        
        while (noWinner){
            
            // take out the player whose turn is and also the player in the list back
            Player playerTurn = players.removeFirst();
            
            // get the free space from the board
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }
            
            //read the user input
            System.out.println("Player:" + playerTurn.name + " Enter row, column");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            String[] values = s.split(",");
            
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);
            
            //place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            
            players.addLast(playerTurn);
            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.type);
            if (winner){
                return playerTurn.name;
            }
        }
        return "tie";
    }

    private boolean isThereWinner(int row, int column, PieceType type) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;
        
        // check for row
        for (int i=0; i<gameBoard.size; i++){
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].type != type){
                rowMatch = false;
                break;
            }
        }
        
        // check for column
        for (int i=0; i<gameBoard.size; i++){
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].type != type){
                columnMatch = false;
                break;
            }
        }
        
        // check for diagonal
        for (int i=0, j=0; i<gameBoard.size; i++,j++){
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != type){
                diagonalMatch = false;
                break;
            }
        }
        
        // check for antiDiagonal
        for (int i=0, j=gameBoard.size-1; i<gameBoard.size; i++,j--){
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != type){
                antiDiagonalMatch = false;
                break;
            }
        }
        
        
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
