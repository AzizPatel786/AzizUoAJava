import java.util.Random;
import java.util.Scanner;

public class Lecture5 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a name:");
//        String name = input.nextLine();
//        System.out.print(("*").repeat(name.length()+6));
//        System.out.println("\n   " + name + "   ");
//        System.out.print(("*").repeat(name.length()+6));
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Random rand = new Random(30);
//        System.out.println("Enter a name: ");
//        String name = input.next();
//        int randIndex = rand.nextInt(name.length());
//        System.out.print(name.substring(0, randIndex) + name.substring(randIndex + 1, name.length()));
//    }


//    // return Celsius equivalent of Fahrenheit temperature
//    public static int toFahrenheit(int c){
//        int cc = (int) ((9.0/5.0)* c);
//        return (cc) + 32;
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int fahrenheit = 0, celsius = 0;
//        System.out.println("Enter a temperature in degrees Celsius: ");
//        celsius = input.nextInt();
//        fahrenheit = toFahrenheit(celsius);
//        System.out.printf("%d degrees Celsius is %d degrees Fahrenheit\n", celsius, fahrenheit);
//    }

    public static int toCelsius(int f){
        return (int) (5.0/9.0 * (f - 32));
    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int fahrenheit = 0, celsius = 0;
//        System.out.println("Enter a temperature in degrees Fahrenheit: ");
//        fahrenheit = input.nextInt();
//        celsius = toCelsius(fahrenheit);
//        System.out.printf("%d degrees Fahrenheit is %d degrees Celsius\n", fahrenheit, celsius);
//        System.out.print(method1(3, 5.0));
        m1(1.5f);
    }

    public static int calculateMax(int number1, int number2) {
        return Math.max(number1, number2);
    }

    public static int calculateMax(int number1, int number2, int number3){
        return Math.max(Math.max(number1, number2), number3);
    }

    public static void show(String value, int repeat){
        System.out.print(String.valueOf(value).repeat(repeat));
    }

    public static void show(int value, int value2){
        System.out.print(value+value2);
    }

    public static int method1(int number1, int number2) {
        return number1 + number2 + 1;
    }
    public static int method1(double number1, double number2) {
        return  (int)( number1 * number2) ;
    }

    public static void m1(double a) {
        System.out.println("double-arg");
    }
    public static void m1(int a) {
        System.out.println("int-arg");
    }

    public static int getDiceThrows(int numberOfThrows, int diceNumber) {
        Random rand = new Random(30);
        int count = 0;
        for (int i = 0; i < numberOfThrows; i++) {
            if (diceNumber == (rand.nextInt(6) + 1)) {
                count += 1;
            }
        }
        return count;
    }
}
