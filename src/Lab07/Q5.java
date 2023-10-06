package Lab07;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int validValue = -1;

        while (true) {
            System.out.println("Enter an integer between 1 and 10: ");

            try {
                int value = input.nextInt();

                if (value >= 1 && value <= 10) {
                    validValue = value;
                    break;
                }
            } catch (Exception e) {
                input.nextLine(); //clear the invalid input
            }
        }

        System.out.println("The valid value entered is " + validValue);
    }
}
