import java.util.Scanner;

public class Lecture2 {
    //program which prints the area and perimeter of a circle. Print the result to 2 decimal places.
//    public static void main(String[] args) {
//        double radius = 7.5;
//        double perimeter= 2*Math.PI*radius, area=Math.PI*(radius*radius);
//        System.out.printf("Perimeter is = %.2f\nArea is = %.2f", perimeter, area);
//    }

    //converts an int to a String and converts from a String to an int.
//    public static void main(String[] args) {
//        int value = 12;
//        String myString = "" + value;
//        System.out.println(myString);
//
//        String myValue = "123";
//        int myInt = Integer.parseInt(myValue);
//        System.out.println(myInt);
//
//    }
    //prompts the user to enter an integer as a radius and calculates the area and perimeter of a circle.
//    public static void main(String[] args){
//        Scanner console = new Scanner(System.in);
//        System.out.println("Enter a radius:");
//        double radius = console.nextDouble();
//        double perimeter= 2*Math.PI*radius, area=Math.PI*(radius*radius);
//        System.out.printf("Perimeter is = %.2f\nArea is = %.2f", perimeter, area);
//    }
    //Sum the two user inputs.
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n1 = console.nextInt();
        System.out.println("Enter another number:");
        int n2 = console.nextInt();
        System.out.printf("The sum is %d.", n1+n2);
    }
}
