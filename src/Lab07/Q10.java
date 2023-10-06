package Lab07;

import java.util.*;

class MySquare1 implements Comparable<MySquare1>{
    protected int sideLength=1;
    public MySquare1() { this(1); }
    public MySquare1(int s) { sideLength = s; }
    public int getSideLength() { return sideLength; }
    public int getArea() { return sideLength * sideLength; }
    public String toString() { return String.format("%s:area=%d", getClass().getName(), getArea()); }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return sideLength == ((MySquare1) other).getSideLength();
    }
    @Override
    public int compareTo(MySquare1 other) {
        // Compare MySquare objects based on their sideLength
        return sideLength - other.getSideLength();
    }
}
public class Q10 {
    public static void main(String[] args) {
        List<MySquare1> squares = new ArrayList<MySquare1>();
        squares.add(new MySquare1(4));
        squares.add(new MySquare1(3));
        squares.add(new MySquare1(9));
        System.out.println(squares.contains(new MySquare1(3)));
    }
}
