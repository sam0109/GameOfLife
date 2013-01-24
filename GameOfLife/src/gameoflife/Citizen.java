
package gameoflife;

public class Citizen {
    public boolean alive = false;
    public boolean aliveNextRound;
    int row;
    int column;
    boolean boardEdge;
    
    Citizen (int i, int j, boolean edge) {
        row = i;
        column  = j;
        boardEdge = edge;
    }
    public void update () {
        if (boardEdge){
            alive = false;
            aliveNextRound = false;
            return;
        }
        int neighbors = 0;
        if (GameOfLife.gameboard[row-1][column-1].alive == true) {
            neighbors++;
        }
        if (GameOfLife.gameboard[row-1][column].alive == true) {
            neighbors++;
        }
        if (GameOfLife.gameboard[row-1][column+1].alive == true) {
            neighbors++;
        }
        if (GameOfLife.gameboard[row][column-1].alive == true) {
            neighbors++;
        }
        if (GameOfLife.gameboard[row][column+1].alive == true) {
            neighbors++;
        }
        if (GameOfLife.gameboard[row+1][column-1].alive == true) {
            neighbors++;
        }
        if (GameOfLife.gameboard[row+1][column].alive == true) {
            neighbors++;
        }
        if (GameOfLife.gameboard[row+1][column+1].alive == true) {
            neighbors++;
        }
        
        if (neighbors <= 1) {
            aliveNextRound = false;
        }
        else if (neighbors == 3) {
            aliveNextRound = true;
        }
        else if (neighbors > 3){
            aliveNextRound = false;
        }
    }
}
