package Lecture15;

import java.io.File;
import java.util.Scanner;

public class Q8 {
    public static void printNames(String filename)  {
        Scanner fileInput = null;
        String line = null;
        try {
            fileInput = new Scanner(new File(filename));
            fileInput.useDelimiter(",");
            while (fileInput.hasNext()){
                System.out.println(fileInput.next());
            }
        } catch (Exception e) {}
        finally {
            fileInput.close();
        }
    }
}
