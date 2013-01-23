
package gameoflife;

public class Citizen {
    boolean alive;
    int row;
    int column;
    Citizen[][] localgameboard = null;
    
    Citizen (int i, int j, Citizen[][] gameboard) {
        row = i;
        column  = j;
        gameboard = localgameboard;
    }
    public void update () {
        int neighbors = 0;
        if (localgameboard[row+1][column].alive = 1) {
            neighbors++;
        }
    }
}
