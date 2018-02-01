package tictactoe;

import java.util.Scanner;

public class TicTacToeMain {

    public static void main(String[] args) {
        boolean o = true;
        Scanner q = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        Player p = new Player();
        while (o == true) {
            try {
                System.out.println("What would you like to do?");
                System.out.println("1) play a game");
                System.out.println("2) Quit");
                int y = q.nextInt();
                if (y == 1) {
                    System.out.println("How many players are there?(1 or 2)");
                    int x = w.nextInt();
                    if (x == 1) {
                        boolean u = true;
                        p.player1();
                        p.gb();
                        p.display();
                        while (u == true) {
                            p.moveP1();
                            p.checkWin(p.x, p.y, p.player1c, p.player1n);
                            p.display();
                            if (p.eg == true) {
                                p.bot();
                                p.checkWin(p.c, p.v, p.z, p.name);
                                p.display();
                            }
                            if (p.eg == false) {
                                p.reset();
                                u = false;
                            }
                        }
                    } else if (x == 2) {
                        boolean h = true;
                        p.player1();
                        p.player2();
                        p.gb();
                        p.display();
                        while (h == true){
                        p.moveP1();
                        p.checkWin(p.x, p.y, p.player1c, p.player1n);
                        p.display();
                        if(p.eg == true){
                            p.moveP2();
                            p.checkWin(p.x, p.y, p.player2c, p.player2n);
                            p.display();
                        }
                        if(p.eg == false){
                            p.reset();
                            h = false;
                        }
                        }
                    } else {
                        System.out.println("please enter a valid number" + '\n');
                    }
                } else if (y == 2) {
                    o = false;
                } else {
                    System.out.print("Please enter a valid number" + '\n');
                }
            } catch (java.util.InputMismatchException e) {
            }
        }
    }
}
