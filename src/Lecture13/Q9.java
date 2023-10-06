package Lecture13;

import java.util.Objects;

interface Comparable<T> {
    public int compareTo(T o);
}

class Fruit implements Comparable<Fruit>{
    private int weight;
    private String name;
    public Fruit (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() { return String.format("%s(%dkg)", name, weight); }
    public boolean equals(Fruit other){
        return (Objects.equals(this.name, other.name)) && (this.weight == other.weight);
    }
    public int compareTo(Fruit other){
        return this.weight - other.weight;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("a bag of oranges", 2);
        Fruit f2 = new Fruit("a bag of apples", 1);
        Fruit f3 = new Fruit("a bag of bananas", 3);
//        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
//        fruits.add(f1);
//        fruits.add(f2);
//        fruits.add(f3);
//        Collections.sort(fruits);
//        System.out.println(fruits);
    }
}
