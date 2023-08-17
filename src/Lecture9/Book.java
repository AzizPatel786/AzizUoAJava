package Lecture9;

import java.util.Objects;

public class Book {
    public static void main(String[] args) {
//        Book firstBook  = new Book("The JFC Swing Tutorial", "Kathy Walrath", "0201914670");
//        Book secondBook = new Book("The JFC Swing Tutorial", "Kathy Walrath", "0201914670");
//        System.out.println(firstBook.getTitle());
//        System.out.println(firstBook.getISBNCode());
//        if (firstBook.equals(secondBook)) {
//            System.out.println("equivalent objects");
//        } else {
//            System.out.println("non-equivalent objects");
//        }
//        if (firstBook == secondBook){
//            System.out.println("two references to the same object");
//        } else {
//            System.out.println("references to different objects");
//        }
        EBook firstBook  = new EBook("The JFC Swing Tutorial", "Kathy Walrath", "0201914670", "http//abc.com", 128);
        EBook secondBook = new EBook("The JFC Swing Tutorial", "Kathy Walrath", "0201914670", "http://xyz.com", 256);
        System.out.println(firstBook  );
        System.out.println(secondBook );
        System.out.println(secondBook.getTitle());
        System.out.println(secondBook.getISBNCode());
    }
    protected String title;
    protected String author;
    protected String publisher;
    protected int yearOfEdition;
    protected String ISBNCode = "N/A";
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBNCode = ISBN;
    }
    public Book(String title, String author, String publisher, int yearOfEdition, String ISBN){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfEdition = yearOfEdition;
        this.ISBNCode = ISBN;
    }
    @Override
    public String toString(){
        return String.format("Book=%s, author=%s, ISBN=%s", this.title, this.author, this.ISBNCode);
    }
    public String getTitle(){
        return this.title;
    }
    public String getISBNCode(){
        return this.ISBNCode;
    }
    @Override
    public boolean equals(Object obj){
        return (obj instanceof Book) && (Objects.equals(((Book) obj).ISBNCode, ISBNCode));
    }
}

