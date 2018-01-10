package arrayplusmain;

public class ArrayPlusMain {
    public static void main(String[] args) {
        ArrayPlus a1 = new ArrayPlus();
        a1.randomize(1, 100, 20);
        a1.display();
        a1.bubbleSort();
        a1.display();
    }
}
