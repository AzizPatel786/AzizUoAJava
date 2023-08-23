package Lecture13;

interface A {
    void method1();
    void method2();
}
interface B extends A {
    void method3();
}

class MyClass implements A, B{
    @Override
    public void method1() {
        System.out.println("implement method1");
    }

    @Override
    public void method2() {
        System.out.println("implement method2");
    }

    @Override
    public void method3() {
        System.out.println("implement method3");
    }
}

public class Q3 {
    public static void main(String[] args) {
        MyClass c = new MyClass();
        c.method1();
        c.method2();
        c.method3();
    }
}
