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
    static Citizen[][] gameboard = null;
    public static void main(String[] args) {
        Scanner user_input = new Scanner( System.in );
        int width;
        int height;
        System.out.print("Width:");
        width = user_input.nextInt();
        System.out.print("Height:");
        height = user_input.nextInt();
        gameboard = new Citizen[width][height];
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                gameboard[i][j] = new Citizen(i,j, gameboard); // Check if arrays are being reated correctly.
            }
        }
        PrintGameboard();
    }
    
    public static void PrintGameboard() {
        System.out.println(GameOfLife.gameboard.length);
        for (int i = 0; i < GameOfLife.gameboard.length; i++){
            for (int j = 0; j < GameOfLife.gameboard[i].length; j++){
                System.out.print(GameOfLife.gameboard[i][j].alive + " ");
            }
            System.out.println();
        }
    }
}