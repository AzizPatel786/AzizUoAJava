class Person{
    private String name;
    private int age;
    public Person(){
        this.name = "";
        this.age = 1;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return name + "(" + age + ")";
//    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if (age >= 0 && age <= 120){
            this.age = age;
        }
    }
    public void growOlder(){
        this.age += 1;
    }
    public Boolean isOfLegalAge(){
        return this.age >= 18;
    }
    private double weight;
    private double height;
    public Person(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getBodyMassIndex(){
        return (this.weight)/ (this.height*this.height);
    }
    @Override
    public String toString() {
        double bmi = (this.weight)/ (this.height*this.height);
        return name + "(" + age + "),BMI=" + String.format("%.2f", bmi);
    }
}

class SimpleCircle{
    private int radius;
    public SimpleCircle(){
        this.radius = 1;
    }
    public SimpleCircle(int radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle, radius=" + radius;
    }
}

class MyPoint{
    private int x, y;
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public MyPoint add(MyPoint other){
        return new MyPoint(this.x + other.getX(), this.y + other.getY());
    }
    public int multiply(MyPoint other){
        return this.x * other.x + this.y * other.y;
    }
    public MyPoint scalar_multiply(int value){
        return new MyPoint(this.x * value, this.y * value);
    }
}

class Puppy{
    public int puppyAge=1;
    private String puppyName;
    public Puppy(String name){
        puppyName=name;
    }
    public void setAge( int age ){
        puppyAge = age;
    }
    public int getAge( ){
        return puppyAge;
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private static int count;

    public Employee( String fname, String lname ) {
        firstName = fname; lastName = lname;
        count++;
    }
    public String toString() {
        return String.format("%s, %s%n", lastName, firstName);
    }
    public static int getCount(){
        return count;
    }
}

enum Grade {
    E, D, C, B, A;
    public static Grade convertToGrade(int score) {
        if (score >= 9 && score <= 10) {
            return A;
        } else if (score >= 7 && score <= 8) {
            return B;
        } else if (score >= 5 && score <= 6) {
            return C;
        } else if (score >= 3 && score <= 4) {
            return D;
        } else {
            return E;
        }
    }
    public boolean isPass() {
        return this.ordinal() >= C.ordinal();
    }
}




public class Lecture7 {
    enum Size {SMALL, REGULAR, LARGE;}
    public static double calculatePrice(Size size, int number){
        double price = switch (size) {
            case SMALL -> 12.0;
            case REGULAR -> 20.0;
            case LARGE -> 25.0;
        };
        return price * number;
    }
    public static void main(String[] args) {
        //Question 1
//        Person p1 = new Person("Michael", 21);
//        System.out.println(p1);
//        Person p2 = new Person("Jason", 15);
//        System.out.println(p2);
//        Person p3 = new Person();
//        System.out.println(p3);
        //Question 2
//        SimpleCircle p = new SimpleCircle();
//        System.out.println(p);
//        SimpleCircle p2 = new SimpleCircle(10);
//        System.out.println(p2);
//        System.out.println(p == p2);
        //Question 3
//        MyPoint p2 = new MyPoint();
//        System.out.println(p2);
//        MyPoint p = new MyPoint(10, 20);
//        System.out.println(p);
        //Question 5
//        Puppy myPuppy = new Puppy("tommy");
//        myPuppy.setAge( 2 );
//        int value = myPuppy.getAge( );
//        System.out.println("Variable Value :" + myPuppy.puppyAge );
        //Question 6
//        Person p1 = new Person("Michael", 21);
//        System.out.println(p1.getName());
//        System.out.println(p1.getAge());
//        p1.setName("Peter");
//        p1.setAge(-9);
//        System.out.println(p1);
//        p1.setAge(9);
//        System.out.println(p1);
        //Question 7
//        Person p1 = new Person("Michael", 17);
//        Person p2 = new Person("Jason", 15);
//        p1.growOlder();
//        p2.growOlder();
//        System.out.println(p1.isOfLegalAge());
//        System.out.println(p2.isOfLegalAge());
//        System.out.println(p1);
//        System.out.println(p2);
        //Question 8
//        Person p1 = new Person();
//        p1.setName("Peter");
//        p1.setWeight(68.2);
//        p1.setHeight(1.82);
//        System.out.println(p1);
        //Question 11
//        Grade myGrade = Grade.convertToGrade(7);
//        System.out.println(myGrade.isPass());
//        Grade g4 = Grade.convertToGrade(0);
//        System.out.println(g4.isPass());
//        System.out.println(g4);
        // Question 12
        System.out.println(calculatePrice(Size.SMALL, 2));
        System.out.println(calculatePrice(Size.REGULAR, 6));
        System.out.println(calculatePrice(Size.LARGE, 8));
    }
}