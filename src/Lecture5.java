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


    // return Celsius equivalent of Fahrenheit temperature
    public static int toFahrenheit(int c){
        int cc = (int) ((9.0/5.0)* c);
        return (cc) + 32;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = 0, celsius = 0;
        System.out.println("Enter a temperature in degrees Celsius: ");
        celsius = input.nextInt();
        fahrenheit = toFahrenheit(celsius);
        System.out.printf("%d degrees Celsius is %d degrees Fahrenheit\n", celsius, fahrenheit);
    }


}
