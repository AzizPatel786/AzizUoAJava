package Lab06;

//interface Comparable<T>{
//  public int compareTo(T other);
//}

class MySquare implements Comparable<MySquare>{
	  protected int sideLength = 1;
	  public MySquare() { this(1); }
	  public MySquare(int s) { sideLength = s; }
	  public int getArea() { return sideLength * sideLength; }
	  public String toString() { return String.format("%s, area=%d", getClass().getName(), getArea()); }
	@Override
	public int compareTo(MySquare other) {
		return this.sideLength - other.sideLength;
	}
} 

public class Q7 {

	public static void main(String[] args) {
		MySquare t1 = new MySquare(2);
		MySquare t2 = new MySquare(5);
		System.out.println(t1.compareTo(t2));
		System.out.println(t2.compareTo(t1));

	}

}
