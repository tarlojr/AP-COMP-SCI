package dicewitharray;
/*
 * import java.util.Arrays;
 */

public class Dice {
        private int numRolls;
        private int roll;
        
        public int roll(int i){
            numRolls++;
            roll = (int)(Math.random()*i)+1;
            return roll;
        }
        public int numRolls(){
            return numRolls;
        }
        public void reset(){
            numRolls = 0;
        }
        public void display(int[]a1){
            //System.out.println(Arrays.toString(a1));
            if(a1.length <= 10){
                for(int x = 0; x < a1.length; x++){
                  if(x>0){
                      System.out.print(", ");
                  }
                  System.out.print(a1[x]);
                }
                System.out.println();
            }
            if(a1.length > 10){
                int y = 0;
                for(int x = 0; x < a1.length; x++){
                    if(x>0){
                    System.out.print(", ");
                    y++;
                    if(y == 20){
                        System.out.println();
                        y = 0;
                    }
                    }
                    System.out.print(a1[x]);
                }
                System.out.println();
            }
        }
}