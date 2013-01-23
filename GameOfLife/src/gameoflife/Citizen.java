
package gameoflife;

public class Citizen {
    boolean alive;
    
    public Citizen (int i, int j) {
        int row = i;
        int column  = j;
    }
    public static void Update () {
        int neighbors = 0;
        if (gameboard[row+1][column] = 1) {
            neighbors++;
        }
    }
}
