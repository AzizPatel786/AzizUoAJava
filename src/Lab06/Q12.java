package Lab06;

import java.util.*;

class PolygonalNumber implements Iterable<Integer> {
    private int[] numbers;

    public PolygonalNumber() {
        this(1, 1);
    }

    public PolygonalNumber(int sides, int n) {
        numbers = new int[n];
        numbers[0] = 1;

        for (int i = 1; i < n; i++) {
            numbers[i] = numbers[i - 1] + (sides - 2) * i;
        }
    }

    public Iterator<Integer> iterator() {
        return new NumberIterator();
    }

    private class NumberIterator implements Iterator<Integer> {
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < numbers.length;
        }

        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return numbers[currentIndex++];
        }
    }
}


public class Q12 {
    public static void main(String[] args) {
        PolygonalNumber g1 = new PolygonalNumber(3, 6);
        for (int i: g1) System.out.print(i + " "); System.out.println();
        PolygonalNumber g2 = new PolygonalNumber(4, 3);
        for (int i: g2) System.out.print(i + " "); System.out.println();
        PolygonalNumber g3 = new PolygonalNumber(5, 3);
        for (int i: g3) System.out.print(i + " "); System.out.println();
    }
}
