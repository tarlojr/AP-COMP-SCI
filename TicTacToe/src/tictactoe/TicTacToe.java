package tictactoe;

public class TicTacToe {

    char gb[][];
    private String gbs = "";
    int p = 0;

    public void gb() {
        gb = new char[3][3];
        for (int i = 0; i < gb.length; i++) {
            for (int x = 0; x < gb[0].length; x++) {
                gb[i][x] += '*';
            }
        }
    }
    
    public void checkWin(int x, int y){
                
    }

    public void display() {
        gbs = "  1 2 3" + '\n';
        for (int x = 0; x < gb.length; x++) {
            gbs += x + 1 + " ";
            for (int y = 0; y < gb[0].length; y++) {
                gbs += gb[x][y] + " ";
            }
            gbs += "\n";
        }
        System.out.println(gbs);
    }
}