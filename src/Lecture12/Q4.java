package Lecture12;

abstract class Animal{
    public abstract void makeSound();
}

class Dog extends Animal{
    public void makeSound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal{
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Animal a = new Cat(); a.makeSound();
        Animal b = new Dog(); b.makeSound();
    }
}
