package Lab06;

interface Eater {
  public void eat();
}

abstract class Animal implements Eater{
	protected String name;
	public Animal(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "My name is " + this.name + " and I am a " + getClass().getSimpleName() + ".";
	}
	abstract void speak();
}

class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	public void bark() {
		System.out.println("I can bark.");
	}
	@Override
	public void eat() {
		System.out.println("I eat dog food.");
		
	}
	@Override
	public void speak() {
		System.out.printf("%s says woof.\n", super.getName());
	}
	
}

class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	@Override
	public void eat() {
		System.out.println("I eat cat food.");
		
	}
	@Override
	public void speak() {
		System.out.printf("%s says meow.\n", super.getName());
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		Dog dog = new Dog("Rohu");
		dog.eat();
		System.out.println(dog);
		dog.speak();
		System.out.println(dog instanceof Animal);
		System.out.println(dog instanceof Eater);

	}

}
