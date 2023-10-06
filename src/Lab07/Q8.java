package Lab07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MySquare {
    protected int sideLength=1;
    public MySquare() { this(1); }
    public MySquare(int s) { sideLength = s; }
    public int getSideLength() { return sideLength; }
    public int getArea() { return sideLength * sideLength; }
    public String toString() { return String.format("%s:area=%d", getClass().getName(), getArea()); }
}
public class Q8 {
    public static List<MySquare> readAndCreateSquares(String filename) {
        List<MySquare> squares = new ArrayList<>();

        try (Scanner fileInput = new Scanner(new File(filename))) {
            while (fileInput.hasNextInt()) {
                try {
                    int sideLength = fileInput.nextInt();
                    squares.add(new MySquare(sideLength));
                } catch (IllegalArgumentException e) {
                    // Invalid side length, ignore and continue
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: The file '" + filename + "' does not exist.");
        }

        return squares;
    }
}
