package Lecture13;

interface Area {
    void printArea(double a, double b);
}

class Rectangle implements Area{
    @Override
    public void printArea(double a, double b) {
        System.out.println("The area of a Rectangle is " + String.format("%.2f",(a*b)));
    }
}

class Circle implements Area{
    @Override
    public void printArea(double a, double b) {
        System.out.println("The area of a Circle is " + String.format("%.2f",(Math.PI*a*b)));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Area r1 = new Rectangle();
        r1.printArea(10, 5);
        Area r2 = new Circle();
        r2.printArea(2, 2);
    }
}
