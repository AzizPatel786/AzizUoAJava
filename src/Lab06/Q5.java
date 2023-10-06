package Lab06;

import java.util.ArrayList;

class ArithmeticSequence implements Incrementable{
	private ArrayList<Integer> numbers;
	public ArithmeticSequence() {
		this.numbers = new ArrayList<Integer>();
	}
	public ArithmeticSequence(int ft, int cd, int terms) {
		this.numbers = new ArrayList<Integer>();
		for (int i = 0; i < terms; i++) {
			this.numbers.add(ft + (cd * i));
		}
	}
	@Override
	public String toString() {
		return this.numbers.toString();
	}
	@Override
	public void increment() {
		for (int i = 0; i < this.numbers.size(); i++) {
			this.numbers.set(i, this.numbers.get(i) + 1);
		}
		
	}
}

interface Incrementable{
	public void increment();
}

public class Q5 {

	public static void main(String[] args) {
		ArithmeticSequence m1 = new ArithmeticSequence();System.out.println(m1);     
		ArithmeticSequence m2 = new ArithmeticSequence(1, 3, 5);System.out.println(m2);  

	}

}
