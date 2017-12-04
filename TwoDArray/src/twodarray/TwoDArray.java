package twodarray;

public class TwoDArray {
    int math;
    int[][] twoDArray;
    public TwoDArray(int r, int c){
        twoDArray = new int[r][c];
    }
    public void display(){
        if(twoDArray.length <= 10){
                for(int x = 0; x < twoDArray.length; x++){
                  if(x>0){
                      System.out.print(", ");
                  }
                  System.out.print(twoDArray[x]);
                }
                System.out.println();
            }
    }
    public void randomize(){
        for(int y = 0; y>twoDArray.length; y++){
            int[] x = new int [1];
            x[1] = x[(int)(Math.random()+1)*100];
            twoDArray[y] = x;
        }
    }
}
