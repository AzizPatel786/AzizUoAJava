package Lecture15;

import java.io.File;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println(getString("words.txt"));
    }

    public static String getString(String filename) {
        Scanner fileInput = null;
        StringBuilder sb = null;
        try {
            fileInput = new Scanner(new File(filename));
            sb = new StringBuilder();
            while (fileInput.hasNextLine()) {
                sb.append(fileInput.nextLine().charAt(0));
            }
        } catch (Exception ignored) {

        } finally {
            fileInput.close();
            return sb.toString();
        }
    }
}
