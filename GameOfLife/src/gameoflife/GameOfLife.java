/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author sam
 */
public class GameOfLife {
    public static void main(String[] args) {
        Citizen[][] gameboard = null;
        for (int i = 0; i <= gameboard.length; i++){
            for (int j = 0; j <= gameboard[0].length; i++){
                gameboard[i][j] = new Citizen(i,j, gameboard);
            }
        }
    }
}
