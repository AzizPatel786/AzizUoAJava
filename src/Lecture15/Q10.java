package Lecture15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q10 {
    public static void processMarks(String filename, String course) {
        Scanner fileInput = null;
        try {
            fileInput = new Scanner(new File(filename));
            double c = 0.0;
            int s = 0;
            while (fileInput.hasNextInt()) {
                try{
                    c++;
                    s += fileInput.nextInt();
                } catch (NumberFormatException e){}

            }
            System.out.println(course);
            System.out.println("Number of students: " + (int) c);
            if (c > 0) {
                System.out.println("Average mark: " + Math.round(s / c));
            } else {
                System.out.println("Average mark: " + 0);
            }
            fileInput.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: The file '" + filename + "' does not exist.");
        }
    }
}
