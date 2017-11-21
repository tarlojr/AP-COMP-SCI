package dicewitharray;

import java.util.Arrays;

public class Dice {
        private int numRolls;
        private int roll;
        private int max;
        private int min;
        private int position;
        private int sum = 0;
        private int avg;
        private String display;
        
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
        System.out.println("The max number was "+max+" and it is located at number "+position+" in the array");
        }
        public void fillArray(int[] a1, int x){
         for(int x1 = 0; x1 < a1.length; x1++){
            a1[x1] = roll(x);
        }   
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
        public void min(int[] a1){
            min = a1[0];
        for (int x2 = 1; x2 < a1.length; x2++) {
            if (a1[x2] < min) {
                min = a1[x2];
                position = x2+1;
            }
        }
        System.out.println("The min number was "+min+" and it is located at number "+position+" in the array");
        }
        public void avg(int[] a1){
            for(int x = 0; x < a1.length; x++){
                sum = sum+a1[x];
            }
            avg = sum/a1.length;
            System.out.println("The average number in the array is "+avg);
        }
}