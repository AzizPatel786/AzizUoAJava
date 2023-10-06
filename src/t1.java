class Base {
    protected int x = 10;
    public static int y = 20;
    public Base() {
        x = ++y;
    }
    public Base(int x) {
        this.x=x+ ++y;
    }
    public int foo() { return x; }
    public static int goo() { return y; }
}
class Derived extends Base {
    protected int x = 300;
    public static int y = 400;
    public Derived() {
        x = ++y;
    }
    public Derived(int x1, int x2) {
        super(x1);
        this.x = x2+ ++y;
    }
    public int foo() { return x; }
    public String toString() {
        return String.format("super.x=%d, x=%d", super.x, x);
    }
}



public class t1 {
    public static void main(String[] args) {
            Base b1 = new Derived();
            Base b2 = new Derived(2, 6);
            System.out.println(b1);
            System.out.println(b2);
    }
}
