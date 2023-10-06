package Lecture15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q9 {
    public static int extractWords(String filename){
        Scanner fileInput = null;
        int c = 0;
        try {
            fileInput = new Scanner(new File(filename));
            while (fileInput.hasNext()){
                String word = fileInput.next();
                char d = word.toLowerCase().charAt(0);
                if (d == 'a' || d == 'e' || d == 'o' || d == 'i' || d == 'u'){
                    System.out.println(word);
                    c++;
                }
            }
            fileInput.close();
        } catch (FileNotFoundException e){
            System.out.println("ERROR: The file '" + filename + "' does not exist.");
        } finally {
            return c;
        }
    }
}
