package tictactoe;

public class TicTacToe {

    char gb[][];
    private String gbs = "";
    int p = 0;
    boolean eg = true;
    boolean p1w = false;
    boolean p2w = false;

    public void gb() {
        gb = new char[3][3];
        for (int i = 0; i < gb.length; i++) {
            for (int x = 0; x < gb[0].length; x++) {
                gb[i][x] += '*';
            }
        }
    }

    public boolean checkWin(int x, int y, char s, String p) {
        
        if (gb[0][y] == s && gb[1][y] == s && gb[2][y] == s) {
            if(s == 'X'){
                System.out.println('\n'+"Congrats " + p + " you won"+'\n');
            }
            if(s == 'O'){
                System.out.println('\n'+"Congrats " + p + " you won"+'\n');
            }
            eg = false;
        }
        if (gb[x][0] == s && gb[x][1] == s && gb[x][2] == s) {
            if(s == 'X'){
                System.out.println('\n'+"Congrats " + p + " you won"+'\n');
            }
            if(s == 'O'){
                System.out.println('\n'+"Congrats " + p + " you won"+'\n');
            }
            eg = false;
        }
        if (gb[0][0] == s && gb[1][1] == s && gb[2][2] == s){
            if(s == 'X'){
                System.out.println('\n'+"Congrats " + p + " you won"+'\n');
            }
            if(s == 'O'){
                System.out.println('\n'+"Congrats " + p + " you won"+'\n');
            }
            eg = false;
        }
        if(gb[0][2] == s && gb[1][1] == s && gb[2][0] == s){
            if(s == 'X'){
                System.out.println('\n'+"Congrats " + p + " you won"+'\n');
            }
            if(s == 'O'){
                System.out.println('\n'+"Congrats " + p + " you won"+'\n');
            }
            eg = false;
        }
        if(gb[0][0] != '*' && gb[0][1] != '*' && gb[0][2] != '*' && gb[1][0] != '*' && gb[1][1] != '*' && gb[1][2] != '*' && gb[2][0] != '*' && gb[2][1] != '*' && gb[2][2] != '*'){
            System.out.println("tie please try again");
            eg = false;
        }
        return eg;
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