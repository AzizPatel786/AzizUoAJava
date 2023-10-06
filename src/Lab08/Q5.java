package Lab08;

import java.util.ArrayList;
import java.util.List;

class Borrower {
    private static final int BORROWING_CAPACITY = 20;
    private List<Book> _booksOnLoan = new ArrayList<Book>();
    public boolean canBorrow() {
        return _booksOnLoan.size( ) < BORROWING_CAPACITY;
    }
    public boolean borrow(Book b) {
        if( (!canBorrow()) || b.isOnLoan()) {
            return false;
        }
        b.setBorrowedBy(this);
        _booksOnLoan.add(b);
        return true;
    }
    public int getNumBooksOnLoan(){ return _booksOnLoan.size(); }
}
class Book {
    private Borrower borrowedBy = null;
    public Book() {}
    public void setBorrowedBy(Borrower b) { borrowedBy = b; }
    public boolean isOnLoan() {
        return borrowedBy != null;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Book book = new Book();
        Borrower borrower = new Borrower();
        borrower.borrow(book);
        System.out.println(borrower.canBorrow());

        Borrower borrower2 = new Borrower();
        for(int i = 0; i<=20; i++){
            borrower2.borrow(new Book());
        }
        System.out.println(borrower2.getNumBooksOnLoan());
    }

}
