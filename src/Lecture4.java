import java.util.Random;
import java.util.Scanner;

public class Lecture4 {
//    public static void main(String[] args){
//        int x = -6;
//        while (x < 0) {
//            System.out.print("#");
//            x++;
//        }
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number of rows: ");
//        int row = input.nextInt();
//        int roww = row;
//        for (int i = 1; i <= row; i++){
//            System.out.print(("" + i).repeat(row-i+1));
//            System.out.println();
//            roww -= 1;
//        }
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number of rows: ");
//        int row = input.nextInt();
//        int roww = 0;
//        for (int i = 1; i <= row; i++){
//            System.out.print(("" + i).repeat(i));
//            System.out.println();
//            roww += 1;
//        }
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int guessNum, randNum;
//        Random rand = new Random(30);
//        randNum = rand.nextInt(10);
//        System.out.println("Enter your guess number (0-9):");
//        int num = input.nextInt();
//        String str = (num == randNum) ? "You won." : "You lost. My number is " + randNum + " but your guess is " + num + ".";
//        System.out.println(str);
//    }

//    public static void main(String[] args) {
//        //This program prints average of two integers of all even numbers. You can assume first number is less than second
//        int total = 0, count=0;
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        System.out.printf("Average is %.2f", (num1+num2)/2.0);
//    }

//    public static void main(String[] args) {
//        int total = 0, count=0;
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        for (int i = num1; i <= num2; i++){
//            if (i % 2 == 0){
//                total += i;
//                count += 1;
//            }
//        }
//        System.out.printf("Average is %.2f", (double)(total)/count);
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num; String rows="";
        System.out.println("Enter 3 rows of digits('-1' to end each row):");
        for (int i=0; i < 3; i++) {
            num = input.nextInt();
            while (num != -1) {
                rows = rows + num + " ";
                num = input.nextInt();
            }
            rows += "\n";
        }
        System.out.println("\nRows of digits\n" + rows);
    }
}
