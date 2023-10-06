package Lecture15;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3};
        System.out.println("Enter an index: ");
        try {
            int index = input.nextInt();
            System.out.println("The value is " + array[index]);
        } catch (Exception e){
            System.out.println("ERROR: Invalid index!");
        }

    }
}
