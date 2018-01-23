package tictactoe;

import java.util.Scanner;

public class Player extends TicTacToe {

    Scanner p1 = new Scanner(System.in);
    Scanner p2 = new Scanner(System.in);

    public String player1() {
        System.out.println("Player 1 what is your name?");
        String player1 = p1.nextLine();
        return player1;
    }

    public String player2() {
        System.out.println("Player 1 what is your name?");
        String player2 = p2.nextLine();
        return player2;
    }

    public void moveP1() {
        boolean i = true;
        Scanner mp1 = new Scanner(System.in);
        while (i == true) {
            System.out.println("please enter the row you would like");
            int x = mp1.nextInt() - 1;
            System.out.println("please enter the column you would like");
            int y = mp1.nextInt() - 1;
            if (x <= 2 && y <= 2) {
                if (gb[x][y] == '*') {
                    gb[x][y] = 'O';
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
            System.out.println("please enter the row you would like");
            int x = mp2.nextInt() - 1;
            System.out.println("please enter the column you would like");
            int y = mp2.nextInt() - 1;
            if (gb[x][y] == '*') {
                gb[x][y] = 'x';
                i = false;
            } else {
                System.out.println("please enter a valid number");
            }
        }
    }
}
