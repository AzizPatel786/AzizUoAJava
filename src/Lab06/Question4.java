package Lab06;

//interface Incrementable {
//  public void increment();
//}

class MyPoint implements Incrementable{
	private int x, y;
	public MyPoint() {
		this.x = 1; this.y = 1;
	}
	public MyPoint(int x, int y) {
		this.x = x; this.y = y;
	}
	public void increment() {
		this.x += 1; this.y += 1;
	}
	@Override
	public String toString() {
		return String.format("(%d, %d)", this.x, this.y);
	}
	
}


public class Question4 {
	public static void main() {
		MyPoint m1 = new MyPoint();System.out.println(m1);     
		m1.increment();
		System.out.println(m1);
		System.out.println(m1 instanceof Incrementable);
		MyPoint m2 = new MyPoint(10, 20);System.out.println(m2);     
		m2.increment();
		System.out.println(m2);
	}
}
