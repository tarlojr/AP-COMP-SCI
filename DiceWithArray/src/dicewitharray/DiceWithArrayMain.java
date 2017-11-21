package dicewitharray;

public class DiceWithArrayMain {
    public static void main(String[] args) {
        //array one size 10 dice values must be rolled by a factor of 20
        int[] a1 = new int[10];
        Dice d1 = new Dice();
        d1.fillArray(a1, 20);
        d1.display(a1);
        //Find the max value and then display what the value is and where its located
            
         //array one size 50 dice values must be rolled by a factor of 100
        int[] a2 = new int[50];
        Dice d2 = new Dice();
        d2.fillArray(a2, 100);
        d2.display(a2);
        
        //Find the minimum value then display what the value is and where its located
    }
}
