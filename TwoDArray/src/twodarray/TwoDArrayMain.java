package twodarray;

public class TwoDArrayMain {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int x = 7;
        int y = 3;
        TwoDArray a = new TwoDArray(x, y);
        a.randomize(min, max);
        a.display();
    }
}
