package twodarray;

public class TwoDArray {

    int math;
    int[][] twoDArray;
    String toString = "";

    public TwoDArray(int r, int c) {
        twoDArray = new int[r][c];
    }

    public void display() {
        int y = 0;
        for (int x = 0; x < twoDArray.length; x++) {
            if (y < twoDArray[x].length) {
                toString += twoDArray[x][y] + ", ";
                y++;
            }
        }
        System.out.println(toString);
    }

    public void randomize(int min, int max) {
        for (int y = 0; y < twoDArray.length; y++) {

            for (int u = 0; u < twoDArray[y].length; u++) {
                twoDArray[y][u] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }
    }
}
