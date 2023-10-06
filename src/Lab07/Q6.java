package Lab07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q6 {
    public static int calculateSumOfEvens(String filename) {
        int sum = 0;
        Scanner fileInput = null;

        try {
            fileInput = new Scanner(new File(filename));
            String line;

            while (fileInput.hasNextInt()) {
                    try {
                        int num = fileInput.nextInt();
                        if (num % 2 == 0) {
                            sum += num; // Add even numbers to the sum
                        }
                    } catch (NumberFormatException e) {
                        // Ignore invalid integers
                    }
                }
            fileInput.close();
        } catch (FileNotFoundException e) {
        System.out.println("ERROR: The file '" + filename + "' does not exist.");
    }

        return sum;
    }
}
