package Lab07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)  {

        try (Scanner scanner = new Scanner(System.in)) {
            double radius = 0;
            System.out.println("Enter the radius of the circle:");
            radius = scanner.nextDouble();

            if (radius <= 0) {
                throw new IllegalArgumentException("ERROR: radius must be > 0.");
            }

            double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("The area of the circle is %.2f.\n", area);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Invalid input!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
