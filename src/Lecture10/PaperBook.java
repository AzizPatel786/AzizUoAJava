package Lecture10;

import Lecture9.Book;
import Lecture9.EBook;

import java.util.*;

public class PaperBook extends Book{
    protected int numberOfPages;

    public PaperBook(String title, String author, String ISBN, int i) {
        super(title, author, ISBN);
        this.numberOfPages = i;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString() + " and the number of pages = " + numberOfPages;
    }

    static String[] getTitles(ArrayList<Book> books){
        String[] titles = new String[books.size()];
        for (int i=0; i < books.size(); i++){
            titles[i] = books.get(i).getTitle();
        }
        return titles;
    }

    public static void main(String[] args) {
        // Question 7
//        Book[] books = new Book[3];
//        books[0] = new Book("The JFC Swing Tutorial", "Kathy Walrath", "0201914670");
//        books[1] = new EBook("ABC Tutorial", "Dick Smith", "1234567890", "http//abc.com", 128);
//        books[2] = new PaperBook("Bad habits that lead to success", "Seth Devilin", "3456344550", 314);
//        for (Book b: books) {
//            System.out.println(b);
//            System.out.println(b.getTitle());
//        }
        // Question 8
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("The JFC Swing Tutorial", "Kathy Walrath", "0201914670"));
        books.add(new EBook("ABC Tutorial", "Dick Smith", "1234567890", "http//abc.com", 128));
        books.add(new PaperBook("Bad habits that lead to success", "Seth Devilin", "3456344550", 314));
        String[] data = getTitles(books);
        System.out.println(Arrays.toString(data));
    }
}
