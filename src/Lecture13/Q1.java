package Lecture13;

interface I {
    public void iMethod1(int i);
}
abstract class J implements I {
    public abstract void jMethod1(int j);
}

class K extends J implements I{
    @Override
    public void iMethod1(int i) {
        System.out.println("iMethod1()," + i);
    }

    @Override
    public void jMethod1(int j) {
        System.out.println("jMethod1()," + j);
    }
}

public class Q1 {
    public static void main(String[] args) {
        interface I {
            public void iMethod1(int i);
        }
        abstract class J implements I {
            public abstract void jMethod1(int j);
        }
    }
}
