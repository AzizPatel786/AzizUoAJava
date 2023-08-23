package Lecture13;

class Person implements Comparable<Person>{
    private String name;
    private int age=1;
    public Person(String n) {name = n;}
    public Person(String n, int a) {name = n; age = a;}
    public String toString() {return String.format("%s(%d)",name,age);}
    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }
}


class Rectangle implements Comparable<Rectangle>{
    private int width=1,height=1 ;
    public Rectangle() {}
    public Rectangle(int w, int h) {width = w; height = h;}
    public int getArea() { return width * height; }
    public String toString() {return String.format("%s(%d)",getClass().getSimpleName(), getArea());}
    public int compareTo(Rectangle other){
        return this.getArea() - other.getArea();
    }
}

public class Q7 {
    Person p1 = new Person("Dick Smith", 21);
    Person p2 = new Person("Anna Wong", 29);
    System.out.println(p1.compareTo(p2));

    Rectangle p1 = new Rectangle(2, 9);
    Rectangle p2 = new Rectangle(12, 5);
    System.out.println(p1.compareTo(p2));
}
