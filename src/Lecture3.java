import java.util.Scanner;
public class Lecture3 {
//    public static void main(String[] args){
//        int a, b;
//        double c;
//        System.out.println(7 + 1 + "4 * 2" + 3 + 1);
//        System.out.println("5" + (7 + 1) + 3 * 2 + 1);
//        a = 5;
//        b = a / 3 + 1;
//        c = a / b;
//        System.out.println(a + ", " + b + ", " + c);
//
//    }

//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
////        int april, may, june;
//        double average;
//
//        System.out.println("Rainfall for April: ");
//        int april = input.nextInt();
//        System.out.println("Rainfall for May: ");
//        int may = input.nextInt();
//        System.out.println("Rainfall for June: ");
//        int june = input.nextInt();
//
//        average =  (double) (april + may + june) / 3; //ERROR here
//        System.out.printf("Average rainfall: %.2f", average);
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a score: ");
//        int score = input.nextInt();
//        if (score <= 60){
//            System.out.println('D');
//        } else if (score <= 75) {
//            System.out.println('C');
//        } else if (score <= 90) {
//            System.out.println('B');
//        } else
//            System.out.println('A');
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a grade: ");
//        String grade = input.next();
//        switch(grade) {
//            case "A" :
//                System.out.println("Excellent!");
//                break;
//            case "B" :
//                System.out.println("Well done!");
//                break;
//            case "C" :
//                System.out.println("You passed!");
//                break;
//            case "D" :
//                System.out.println("Better try again");
//                break;
//            default :
//                System.out.println("Invalid grade!");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a temperature: ");
//        int temperature = input.nextInt();
//        String message = (temperature > 20) ? "Take off your jacket!" : "Wear a coat!";
//        System.out.println(message);
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an amount in NZ dollars:");
//        double amt = input.nextDouble();
//        String msg = "NZ $%.1f = AUS $%.1f";
//        System.out.printf(msg, amt, (amt * 0.95));
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the length: ");
//        int l = input.nextInt();
//        System.out.print("\nEnter the width: ");
//        int w = input.nextInt();
//        System.out.print("\nEnter the height: ");
//        int h = input.nextInt();
//        System.out.printf("\nA rectangular prism with length %d width %d and height %d has a surface area of %d square units.", l, w, h, (2*(w*l)+2*(l*h)+2*(h*w)));
//    }

//    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter a year: ");
//        int year = input.nextInt();
//        if ((year%4==0 && year%100!=0) || year%400==0){
//            System.out.print(year + " is a leap year.");
//        } else{
//            System.out.print(year + " is not a leap year.");
//        }
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        boolean result = (number %5==0 && number%11==0) ? true:false;
        if (result){
            System.out.print(number + " is divisible by 5 and 11.");
        }else{
            System.out.print(number + " is not divisible by 5 and 11.");
        }

    }
}
