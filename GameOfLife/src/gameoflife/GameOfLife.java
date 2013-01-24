/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sam
 */
public class GameOfLife {
    static Citizen[][] gameboard = null;
    public static void main(String[] args) {
        Scanner user_input = new Scanner( System.in );
        Random rnd = new Random();
        boolean edge;
        int width;
        int height;
        String continueRunning = "yes";
        System.out.print("Width:");
        width = user_input.nextInt() + 2;
        System.out.print("Height:");
        height = user_input.nextInt() + 2;
        gameboard = new Citizen[height][width];
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                edge = false;
                if (j == width - 1 || i == height-1 || j==0 || i == 0){
                    edge = true;
                }
                gameboard[i][j] = new Citizen(i,j, edge);
                if(!edge) {
                    gameboard[i][j].alive = rnd.nextBoolean();
                }
            }
        }
        while("yes".equals(continueRunning.toLowerCase()) || "y".equals(continueRunning.toLowerCase())) {
            PrintGameboard();
            StepForward();
            System.out.print("continue? y/n: ");
            continueRunning = user_input.next();
        }

    }
    
    public static void PrintGameboard() {
        for (int i = 1; i < GameOfLife.gameboard.length - 1; i++){
            for (int j = 1; j < GameOfLife.gameboard[i].length - 1; j++){
                if (GameOfLife.gameboard[i][j].alive) {
                    System.out.print("X ");
                }
                else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
    public static void StepForward() {
        for (int i = 0; i < GameOfLife.gameboard.length; i++) {
            for (int j = 0; j < GameOfLife.gameboard[i].length; j++){
                GameOfLife.gameboard[i][j].update();
            }
        }
        for (int i = 0; i < GameOfLife.gameboard.length; i++) {
            for (int j = 0; j < GameOfLife.gameboard[i].length; j++){
                GameOfLife.gameboard[i][j].alive = GameOfLife.gameboard[i][j].aliveNextRound;
            }
        }
    }
}