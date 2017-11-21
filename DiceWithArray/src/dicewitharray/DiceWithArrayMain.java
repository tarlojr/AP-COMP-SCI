package dicewitharray;

public class DiceWithArrayMain {
    public static void main(String[] args) {
        //array one size 10 dice values must be rolled by a factor of 20
        Dice d1 = new Dice();
        int[] a1 = new int[10];
        fillArray(a1, 20);
        d1.display(a1);
        max(a1);
        avg(a1);
        //Find the max value and then display what the value is and where its located
            System.out.println();
            System.out.println();
            System.out.println();
         //array one size 50 dice values must be rolled by a factor of 100
        int[] a2 = new int[50];
        Dice d2 = new Dice();
        fillArray(a2, 100);
        d2.display(a2);
        min(a2);
        avg(a2);
        //Find the minimum value then display what the value is and where its located
    }
    public static void max(int[] a1){
        int max;
        int position = 1;
            max = a1[0];
        for (int x2 = 1; x2 < a1.length; x2++) {
            if (a1[x2] > max) {
                max = a1[x2];
                position = x2+1;
            }
        }
        System.out.println("The max number was "+max+" and it is number "+position+" in the array");
        }
    public static void avg(int[] a1){
        double sum = 0;
        double avg = 0;
            for(int x = 0; x < a1.length; x++){
                sum = sum+a1[x];
            }
            avg = sum/a1.length;
            System.out.println("The average number in the array is "+avg);
        }
    public static void min(int[] a1){
        int min = 0;
        int position = 1;
            min = a1[0];
        for (int x2 = 1; x2 < a1.length; x2++) {
            if (a1[x2] < min) {
                min = a1[x2];
                position = x2+1;
            }
        }
        System.out.println("The min number was "+min+" and it is located at number "+position+" in the array");
        }
    public static void fillArray(int[] a1, int x){
        Dice d1 = new Dice();
         for(int x1 = 0; x1 < a1.length; x1++){
            a1[x1] = d1.roll(x);
            }
        }
}