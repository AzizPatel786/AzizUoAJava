package Lecture13;

interface FinancialAidEligible { }
//abstract class Person {
//    int ID;
//    public int getID() { return ID; }
//}
class Student extends Person {}
class Undergraduate extends Student implements FinancialAidEligible {}

public class Q6 {


    public static void main(String[] args) {
        FinancialAidEligible p1 = new Undergraduate();
//        FinancialAidEligible p2 = new FinancialAidEligible();
//        FinancialAidEligible p3 = new Student();
        FinancialAidEligible[] people = new FinancialAidEligible[10];
    }
}
