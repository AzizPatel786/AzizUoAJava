package Lecture15;

public class Q1 {
    public static void main(String[] args) {
        try {
            int num = 8;
            if (num % 2 == 0) {
                throw new ArithmeticException("Incorrect input ");
            }
            System.out.print("A ");
        } catch(ArithmeticException e) {
            System.out.print(e);
        }
        System.out.print("B ");
    }
}
