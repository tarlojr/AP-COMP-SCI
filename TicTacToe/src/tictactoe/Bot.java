package tictactoe;

public class Bot extends TicTacToe {

    boolean i = true;
    String name;
    int x;
    int y;

    public void bot() {
        name = "bot1";
        while (i == true) {
            x = (int) (Math.random() * 3 + 1);
            y = (int) (Math.random() * 3 + 1);
            if (gb[x][y] == '*') {
                gb[x][y] = 'x';
                i = false;
            }
        }
    }
}