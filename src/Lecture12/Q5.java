package Lecture12;

abstract class Person{
    protected String name;
    public Person(){
        this.name = "UNKNOWN";
    }
    public Person(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public abstract void eat();
    @Override
    public String toString(){
        return getClass().getName() + "(" + this.name + ")";
    }
}

class Student extends Person{
    public Student(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("eating fried rice!");
    }
}

class CollegeStudent extends Student{
    public CollegeStudent(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("eating Subway Sub of the Day!");
    }
}

class TertiaryStudent extends Student{
    public TertiaryStudent(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("eating roast chicken!");
    }
}

class Employee extends Person{
    public Employee(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("eating buffet!");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Student s = new CollegeStudent("Michael");
        s.eat();
        System.out.println(s);
        System.out.println(s.getName());

        Person[] people = new Person[4];
        people[0] = new Student("Michael");
        people[1] = new CollegeStudent("Paul");
        people[2] = new TertiaryStudent("Peter");
        people[3] = new Employee("Anna");
        printEatMessages(people);
    }
    public static void printEatMessages(Person[] array){
        for (Person human: array){
            System.out.printf("%s, ", human.getName()); human.eat();
        }
    }


}
