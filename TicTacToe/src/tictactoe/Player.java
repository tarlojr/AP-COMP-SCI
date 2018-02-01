package tictactoe;

import java.util.Scanner;

public class Player extends TicTacToe {

    Scanner p1 = new Scanner(System.in);
    Scanner p2 = new Scanner(System.in);
    int x;
    int y;
    int c;
    int v;
    char z = 'x';
    char player1c = 'O';
    char player2c = 'X';
    String player1n;
    String player2n;
    String name;

    public String player1() {
        System.out.println("Player 1 what is your name?");
        String player1 = p1.nextLine();
        player1n = player1;
        return player1n;
    }

    public String player2() {
        System.out.println("Player 2 what is your name?");
        String player2 = p2.nextLine();
        player2n = player2;
        return player2n;
    }

    public void bot() {
        boolean i = true;
        name = "bot1";
        while (i == true) {
            c = (int) (Math.random() * 3 - 1);
            v = (int) (Math.random() * 3 - 1);
            if (gb[c][v] == '*') {
                gb[c][v] = 'x';
                i = false;
            }
        }
    }

    public void moveP1() {
        boolean i = true;
        Scanner mp1 = new Scanner(System.in);
        while (i == true) {
            System.out.println("player 1 please enter the row you would like");
            x = mp1.nextInt() - 1;
            System.out.println("player 1 please enter the column you would like");
            y = mp1.nextInt() - 1;
            if (x <= 2 && y <= 2) {
                if (gb[x][y] == '*') {
                    gb[x][y] = player1c;
                    i = false;
                } else {
                    System.out.println("please enter a valid number");
                }
            } else {
                System.out.println("please enter a valid number");
            }
        }
    }

    public void moveP2() {
        boolean i = true;
        Scanner mp2 = new Scanner(System.in);
        while (i == true) {
            System.out.println("player 2 please enter the row you would like");
            x = mp2.nextInt() - 1;
            System.out.println("player 2 please enter the column you would like");
            y = mp2.nextInt() - 1;
            if (gb[x][y] == '*') {
                gb[x][y] = player2c;
                i = false;
            } else {
                System.out.println("please enter a valid number");
            }
        }
    }

    public void reset() {
        x = 0;
        y = 0;
        c = 0;
        v = 0;
        z = 'x';
        player1c = 'O';
        player2c = 'X';
        player1n = "";
        player2n = "";
        name = "";
        gb();
        p = 0;
        eg = true;
        p1w = false;
        p2w = false;
    }
}
