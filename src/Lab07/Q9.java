package Lab07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Author {
    private String firstName, surname;
    public Author (String fname, String surname) {
        firstName = fname;
        this.surname = surname;
    }
    public Author(String fullName) {
        String[] values = fullName.split(",");
        surname = values[0];
        firstName = values[1];
    }
    public String toString() {
        return String.format("%s %s", firstName, surname);
    }
}
public class Q9 {
    public static List<Author> readAuthors(String filename) {
        List<Author> authors = new ArrayList<>();

        try (Scanner fileInput = new Scanner(new File(filename))) {
            while (fileInput.hasNextLine()) {
                try {
                    String fullName = fileInput.nextLine();
                    authors.add(new Author(fullName));
                } catch (IllegalArgumentException e) {
                    // Invalid author name, ignore and continue
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: The file '" + filename + "' does not exist.");
        }

        return authors;
    }
}
