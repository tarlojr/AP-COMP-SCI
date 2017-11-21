package dicewitharray;

import java.util.Arrays;

public class Dice {
        private int numRolls;
        private int roll;
        private int max;
        private int position;
        
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
        public void max(int[] a1){
            max = a1[0];
        for (int x2 = 1; x2 < a1.length; x2++) {
            if (a1[x2] > max) {
                max = a1[x2];
                position = x2+1;
            }
        }
        }
        public void fillArray(int[] a1, int x){
         for(int x1 = 0; x1 < a1.length; x1++){
            a1[x1] = roll(x);
        }   
        }
        public void display(int[]a1){
            System.out.println(Arrays.toString(a1));
        }
}