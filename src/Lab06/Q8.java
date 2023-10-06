package Lab06;

import java.util.ArrayList;
import java.util.Comparator;

//interface Comparable<T>{
//  public int compareTo(T other);
//}
//
//public interface Comparator<T>{
//	  int compare(T o1, T o2);
//	}

class Author {
  private String name;
  public Author (String name) {this.name = name;}
  public String getName() {return name;}
  public String toString() {
    return String.format("%s", name);
  }
}

class Book implements Comparable<Book>{
	private String name;
	private ArrayList<Author> authors;
	public Book(String n) {
		this.name = n;
		this.authors = new ArrayList<Author>();
	}
	public void addAuthor(Author a) {
		this.authors.add(a);
	}
	public int getNumberOfAuthors() {
		return this.authors.size();
	}
	@Override
	public String toString() {
		if (this.authors.size() == 0) {
			return this.name;
		}
		return this.authors.toString();
	}
	@Override
	public int compareTo(Book other) {
		return this.name.compareTo(other.name);
	}
}

class CompareByNumberOfAuthors implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getNumberOfAuthors() - o2.getNumberOfAuthors();
	}
}

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
