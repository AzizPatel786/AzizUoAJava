package Lecture11;

class Foo {
    private int i;
    public void f() { System.out.println("Foo:f"); }
    public void g() { System.out.println("Foo:g"); }
}
class Bar extends Foo {
    public int j;
    public void g() { System.out.println("Bar:g");  }
}

public class Q1 {
    public static void main(String[] args) {
        Foo a = new Foo();
        Bar b = new Bar();
    }
}
