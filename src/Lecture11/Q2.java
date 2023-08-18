package Lecture11;
class ClassA {
    public ClassA() {}
    public int method1(double a){return 0;}
    public double method2(int b){ return 0.5; }
}
class ClassB extends ClassA {
    public ClassB(){}
    public int method1(int b, int c){ return 1; }
    public double method2(double c){return 1.5;}
}

class Base {
    public void f() {System.out.println("Base.f");}
    public void g() {System.out.println("Base.g");}
}
class Derived extends Base {
    public void g() {System.out.println("Derived.g");}
    public void h() {System.out.println("Derived.h");}
}
public class Q2 {
    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        ClassB obj2 = new ClassB();
        Derived b2 = new Derived();
        Base b3 = new Derived();
        b3.g();
    }
}
