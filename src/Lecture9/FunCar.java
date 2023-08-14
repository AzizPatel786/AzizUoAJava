package Lecture9;

class Car {
    String theColor = "blue";
    String theBody  = "wagon";
    public Car() {
        System.out.println("Called the default constructor Car().");
    }
    public Car(String color, String body) {
        System.out.println("Called the 2 args constructor Car().");
        theColor = color;
        theBody  = body;
    }
    public String toString() {
        return theColor + " " + theBody + ".";
    }
}
public class FunCar extends Car{
    public static void main(String[] args) {
        FunCar dadsCar = new FunCar("red", "convertible");
        System.out.println("Dad's car is a " + dadsCar.toString( ));
        System.out.println( dadsCar.playCD( ) );
    }
    public FunCar() {
        // implicit call to super( ), which is Car( )
    }
    public FunCar(String color, String body) {
        super(color, body);
    }
    public String playCD() {
        return "(Beautiful music fills the passenger compartment.)";
    }
}
