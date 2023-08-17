package Lecture10;

class Base {
    protected int x = 20;
    public static int y = 300;
    Base() { x = y++; }
    public int foo() { return x; }
    public static int goo() { return y; }
    public void method1() { System.out.println("Base"); }
    public String toString() { return String.format("%s:x=%d,y=%d","Base",x,y);}
}
class Derived extends Base {
    private int x = 30;
    public static int y = 400;
    Derived() { x = y++; }
    public int foo() { return x; }
    public static int goo() { return y; }
    public void method2() { System.out.println("Derived"); }
    public String toString() { return String.format("super.x=%d,super.y=%d,x=%d,y=%d",super.x,super.y,x,y);}
}
public class Q3 {
    public static void main(String[] args) {
        Base b1 = new Base();
        Derived d = new Derived();
        Base b2 = new Derived();
    }
}
