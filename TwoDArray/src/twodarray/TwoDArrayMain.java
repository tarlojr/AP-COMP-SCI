package twodarray;

public class TwoDArrayMain {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        TwoDArray a = new TwoDArray(x, y);
        a.randomize();
        a.display();
    }
}
