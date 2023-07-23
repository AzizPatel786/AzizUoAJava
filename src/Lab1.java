import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Lab1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the radius of the cylinder:");
//        double r = input.nextDouble();
//        System.out.println("Enter the height of the cylinder:");
//        double h = input.nextDouble();
//        System.out.printf("The volume of the cylinder is %.2f cubic units.", Math.PI * Math.pow(r,2) * h);
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter NZD:");
//        double amt = input.nextDouble();
//        String msg = "%.1f NZD is equivalent to %.1f CNY.";
//        System.out.printf(msg, amt, (amt / 0.2105));
//
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the length in feet: ");
//        int f = input.nextInt();
//        System.out.println("Enter the length in inches: ");
//        int i = input.nextInt();
//        int c = (int) Math.round((i*2.54)+(f*(2.54)*12));
//        System.out.printf("%d feet %d inches is approximately %d centimeters.", f, i, c);
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of friends: ");
//        double friend_count = input.nextDouble();
//        System.out.println("Enter the total cost of pizzas: ");
//        double pizza_cost = input.nextDouble();
//        System.out.printf("The shared cost per friend is: $%.2f.", pizza_cost/friend_count);
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a word: ");
//        String word = input.next();
//        System.out.print("The secret code is \'" + word.charAt(0) + word.charAt(word.length()/2) + word.charAt(word.length()-1) + "\'.");
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a web address (www.domain.com): ");
//        String address = input.next();
//        System.out.print("The domain is '" + address.split("\\.")[1].toUpperCase() + "'.");
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a word: ");
//        String word = input.next();
//        StringBuffer buffed_word = new StringBuffer(word);
//        System.out.print("The secret code is '" + word + buffed_word.reverse() + "'.");
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a three-digit integer: ");
//        int num = input.nextInt();
//        StringBuffer buffed_word = (new StringBuffer("" + num)).reverse();
//        String[] s = (buffed_word.toString()).split("");
//        System.out.print("Reverse of digits: " + s[0] + ", " + s[1] + ", " + s[2]);
//    }

//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a date (yyyy-mm-dd): ");
//        String date_str = input.next();
//        LocalDate date = LocalDate.parse(date_str).minusDays(1);
//        System.out.print("The date of the day before is: " + date);
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = input.nextInt();
        System.out.println("Enter the month: ");
        int month = input.nextInt();
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        //   String date_str = "" + year + "-" + month + "-" + day;
        //   LocalDate date = LocalDate.parse(date_str);
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.print("Your birthday is on " + date.format(formatter));
    }

}
