
package gameoflife;

public class Citizen {
    boolean alive;
    int row;
    int column;
    Citizen[][] localgameboard = null;
    
    Citizen (int i, int j, Citizen[][] gameboard) {
        row = i;
        column  = j;
        localgameboard = gameboard;
    }
    public void update () {
        int neighbors = 0;
        if (localgameboard[row-1][column-1].alive == true) {
            neighbors++;
        }
        if (localgameboard[row-1][column].alive == true) {
            neighbors++;
        }
        if (localgameboard[row-1][column+1].alive == true) {
            neighbors++;
        }
        if (localgameboard[row][column-1].alive == true) {
            neighbors++;
        }
        if (localgameboard[row][column+1].alive == true) {
            neighbors++;
        }
        if (localgameboard[row+1][column-1].alive == true) {
            neighbors++;
        }
        if (localgameboard[row+1][column].alive == true) {
            neighbors++;
        }
        if (localgameboard[row+1][column+1].alive == true) {
            neighbors++;
        }
        
        if (neighbors <= 1) {
            alive = false;
        }
        else if (neighbors == 3) {
            alive = true;
        }
        else if (neighbors > 3){
            alive = false;
        }
    }
}
