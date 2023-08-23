package Lecture13;

class Item {
    protected String description;
    protected double price;
    public Item(String des, double pr) {
        description = des;
        price = pr;
    }
    public String toString() { return String.format("Item:%s($%.2f)", description, price); }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
}
interface Taxable {
    public double taxRate = 0.06;
    public double calculateTaxAmount();
}

class Toy extends Item implements Taxable{
    private int minimumAge;
    public Toy(String des, double pr) {
        super(des, pr);
        this.minimumAge = 3;
    }
    public Toy(String des, double pr, int age){
        super(des, pr);
        this.minimumAge = age;
    }
    @Override
    public String toString(){
        return String.format("Item:%s($%.2f),min age=%d", super.description, super.price, this.minimumAge);
    }
    public double calculateTaxAmount(){
        return super.price * taxRate;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Toy t1 = new Toy("Barbie I Can Be Doll", 15);
        Toy t2 = new Toy ("Disney Pixar Toy Story 4 Woody Talking", 39, 4);
        System.out.println(t1);System.out.printf("%.2f\n",t1.calculateTaxAmount());
        System.out.println(t2);System.out.printf("%.2f\n",t2.calculateTaxAmount());
        System.out.println(t1.getDescription()); System.out.println(t1.getPrice());
    }
}
