package Lecture10;
class Vehicle {
    public void move () {
        System.out.println ("Vehicles are used for moving from one place to another ");
    }
}
class Car extends Vehicle {
    public void move () {
        super.move(); // invokes the super class method
        System.out.println ("Car is a good medium of transport ");
    }
}
public class Q6 {
    public static void main(String[] args) {
        Vehicle b = new Car (); // Vehicle reference but Car object
        b.move ();
    }
}
