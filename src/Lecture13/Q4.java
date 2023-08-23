package Lecture13;

interface Cowboy {
    void draw();  // draw the gun - get ready to pump some iron
    void drink(); // enjoy some beverage
    void burp();  // communicate with other people in the bar (or where ever)
}
interface Drawable {
    void draw(int x, int y);  // draw the drawable item on the screen
}

class Person implements Cowboy, Drawable{
    @Override
    public void draw() {
        System.out.println("I'm drawing my gun");
    }
    @Override
    public void drink() {
        System.out.println("I'm drinking...");
    }
    @Override
    public void burp() {
        System.out.println("BURP !!");
    }
    @Override
    public void draw(int x, int y) {
        System.out.printf("I'm drawing a point at (%d, %d)\n", x, y);
    }
}

public class Q4 {
    public static void main(String[] args) {

    }
}
