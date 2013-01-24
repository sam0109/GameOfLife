/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;
import java.util.Scanner;

/**
 *
 * @author sam
 */
public class GameOfLife {
    public static void main(String[] args) {
        Citizen[][] gameboard = null;
        Scanner user_input = new Scanner( System.in );
        int width;
        int height;
        System.out.print("Width:");
        width = user_input.nextInt();
        System.out.print("Height:");
        height = user_input.nextInt();

        for (int i = 0; i <= width; i++){
            for (int j = 0; j <= height; j++){
                gameboard[i][j] = new Citizen(i,j, gameboard);
            }
        }
    }
    
    public void PrintGameboard() {
        for (int i = 0; i <= GameOfLife.gameboard.length; i++){
            for (int j = 0; j <= GameOfLife.gameboard[0].length; i++){
                gameboard[i][j];
            }
        }
    }
}