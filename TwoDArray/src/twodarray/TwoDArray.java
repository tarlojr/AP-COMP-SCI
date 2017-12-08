package twodarray;

public class TwoDArray {

    int math;
    int sumRow;
    int[][] twoDArray;
    String toString = "";
    String toStringRow = "";

    public TwoDArray(int r, int c) {
        twoDArray = new int[r][c];
    }

    public void display() {
        for (int x = 0; x < twoDArray.length; x++) {
            for(int y = 0; y < twoDArray[0].length; y++){
                toString += twoDArray[x][y] + ", ";
            }
            toString += "\n";
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
    
    private void sumEachRow(int x){
            for(int y = 0; y < twoDArray[0].length; y++){
                sumRow = sumRow + twoDArray[x][y];
        }
    }
    public void sumRow(){
        for(int x = 0; x < twoDArray.length; x++){
            sumEachRow(x);
        }
    }
    public void sumColum(){
        
    }
}
