package Lecture9;

public class Animal {
    public static void main(String[] args) {
        Dog fluffy = new Dog("Fluffy", 5.2);
        System.out.println(fluffy);
        Bird tweety = new Bird("Tweety", 1.2);
        System.out.println(tweety );
    }
    protected String name;
    protected double weight;
    public Animal(String animalName, double animalWeight){
        this.name = animalName;
        this.weight = animalWeight;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        if (weight > 0) {
            this.weight = weight;
        }
    }
    @Override
    public String toString() {
        return String.format("Name=%s, weight=%.2f, type=Animal", this.name, this.weight);
    }
}

class Bird extends Animal{

    public Bird(String animalName, double animalWeight) {
        super(animalName, animalWeight);
    }
    @Override
    public String toString() {
        return String.format("Name=%s, weight=%.2f, type=Bird", this.name, this.weight);
    }
}

class Dog extends Animal{

    public Dog(String animalName, double animalWeight) {
        super(animalName, animalWeight);
    }
    @Override
    public String toString() {
        return String.format("Name=%s, weight=%.2f, type=dog", this.name, this.weight);
    }
}