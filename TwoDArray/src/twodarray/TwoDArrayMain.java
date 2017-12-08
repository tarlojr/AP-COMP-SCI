package twodarray;

public class TwoDArrayMain {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int x = 2;
        int y = 2;
        TwoDArray a = new TwoDArray(x, y);
        a.randomize(min, max);
        a.display();
        System.out.println(a.sumRow);
    }
}
