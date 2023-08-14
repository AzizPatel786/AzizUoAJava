package Lecture9;

import java.util.Objects;

public class Puppy{
    public static void main(String[] args) {
        Puppy p = new Puppy("Bubble", 5);
        System.out.println(p);
        Puppy p2 = new Puppy("Sunny", 5);
        System.out.println(p2);
        Puppy p3 = new Puppy("Bubble", 5);
        System.out.println(p3);
        System.out.println(p.equals(p2));
        System.out.println(p.equals(p3));
        Puppy p4 = new Puppy("Bubble", 5);
        System.out.println(p4.equals(5));
    }
    private int puppyAge=1;
    private String puppyName;
    public Puppy(String name){
        puppyName=name;
    }
    public Puppy(String name, int age){
        puppyName=name;
        puppyAge = age;
    }
    public void setAge( int age ){
        puppyAge = age;
    }
    public int getAge( ){
        return puppyAge;
    }
    @Override
    public String toString(){
        return String.format("%s(%d)", this.puppyName, this.puppyAge);
    }
    @Override
    public boolean equals(Object obj){
        return (obj instanceof Puppy) && (Objects.equals(((Puppy) obj).puppyName, puppyName)) && (((Puppy) obj).puppyAge == puppyAge);
    }
}
