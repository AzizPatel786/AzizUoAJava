package Lab07;

import java.util.InputMismatchException;
import java.util.Scanner;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class DayEnumDemo {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an integer:");
            int userInput = scanner.nextInt();

            if (userInput >= 0 && userInput <= 6) {
                Day[] days = Day.values();
                Day correspondingDay = days[userInput];
                System.out.println("Corresponding day: " + correspondingDay);
            } else {
                throw new IllegalArgumentException("ERROR: Invalid value!");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Invalid type!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

