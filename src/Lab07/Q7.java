package Lab07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

enum ChineseZodiac { HARE(2023), DRAGON(2024), SNAKE(2025), HORSE(2026), SHEEP(2027), MONKEY(2028), ROOSTER(2029), DOG(2030), PIG(2031), RAT(2032), OX(2033), TIGER(2034);
    private int year;
    private ChineseZodiac(int value) { year = value; }
    public int getYear() { return year; }
}
public class Q7 {
    public static void readNamePrintYear(String filename) {
        try (Scanner fileInput = new Scanner( new File(filename))) {
            while (fileInput.hasNextLine()) {
                try {
                    ChineseZodiac zodiac = ChineseZodiac.valueOf(fileInput.nextLine());
                    int year = zodiac.getYear();
                    System.out.println("The Zodiac animal of " + year + " is " + zodiac + ".");
                } catch (IllegalArgumentException e) {
                    // Invalid Zodiac name, ignore and continue
                }
            }
//            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: The file '" + filename + "' does not exist.");
        }
    }
}
