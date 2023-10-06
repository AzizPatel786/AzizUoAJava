import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to enter four integers
        System.out.println("Enter four integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        // Determine the smallest value using Math.min() method
        int smallest = findSmallest(num1, num2, num3, num4);
        // Print the result to the console
        System.out.println("The smallest value among the four integers is " + smallest + ".");

        System.out.println("Enter a number (1-7) representing the day of the week:");
        int dayNumber = scanner.nextInt();
        getDayOfWeek(dayNumber);

        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        printChineseZodiacYear(year);

        System.out.println("Enter the start:");
        int start = scanner.nextInt();
        System.out.println("Enter the end:");
        int end = scanner.nextInt();
        printCubesInRange(start, end);

        System.out.println("Enter a positive even number:");
        int evenNumber = getPositiveEvenNumber(scanner);
        System.out.println("The number is " + evenNumber + ".");

        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        printSumOfMultiplesOfThree(n);

        System.out.println("Enter a number:");
        n = scanner.nextInt();
        printSeriesSum(n);

        System.out.println("Enter number of rows:");
        int numRows = scanner.nextInt();
        printNumberPattern(numRows);

        System.out.println("Enter number of rows:");
        numRows = scanner.nextInt();
        printHollowRhombusPattern(numRows);

        System.out.println("Enter a word:");
        String word = scanner.next();
        int consonantCount = countConsonants(word);
        System.out.println("The number of consonants is " + consonantCount + ".");

        System.out.println("Enter a password:");
        String password = scanner.next();
        if (isValidPassword(password)) {
            System.out.println("Your password is valid!");
        } else {
            System.out.println("Your password is invalid!");
        }
    }

    public static int findSmallest(int num1, int num2, int num3, int num4) {
        return Math.min(Math.min(num1, num2), Math.min(num3, num4));
    }

    public static void getDayOfWeek(int dayNumber) {
        String dayOfWeek;
        switch (dayNumber) {
            case 1 -> dayOfWeek = "MONDAY";
            case 2 -> dayOfWeek = "TUESDAY";
            case 3 -> dayOfWeek = "WEDNESDAY";
            case 4 -> dayOfWeek = "THURSDAY";
            case 5 -> dayOfWeek = "FRIDAY";
            case 6 -> dayOfWeek = "SATURDAY";
            case 7 -> dayOfWeek = "SUNDAY";
            default -> {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                return; // Exit the program if the input is invalid
            }
        }
        System.out.println("The day of the week for the number " + dayNumber + " is " + dayOfWeek + ".");
    }

    public static void printChineseZodiacYear(int year) {
        int animalIndex = (year - 1900) % 12;
        String[] animals = {"Rat", "Ox", "Tiger", "Hare", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Pig"};
        if (animalIndex >= 0) {
            String animal = animals[animalIndex];
            System.out.println(year + " is the year of the " + animal + ".");
        } else {
            System.out.println("Invalid year.");
        }
    }

    public static void printCubesInRange(int start, int end) {
        if (start > end) {
            System.out.println("Nothing to print. The start number is larger than the end number.");
        } else {
            for (int i = start; i <= end; i++) {
                int cube = i * i * i;
                System.out.println("The cube of " + i + " is " + cube + ".");
            }
        }
    }

    public static int getPositiveEvenNumber(Scanner scanner) {
        int n;
        do {
            System.out.println("Enter a positive even number:");
            n = scanner.nextInt();
        } while (n <= 0 || n % 2 != 0);
        return n;
    }

    public static void printSumOfMultiplesOfThree(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the multiples of 3 from 1 to " + n + " is " + sum + ".");
    }

    public static void printSeriesSum(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += (1.0 / Math.pow(2, i));
        }
        String formattedSum = String.format("%.5f", sum);
        System.out.println("The sum of this series is " + formattedSum + ".");
    }

    public static void printNumberPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void printHollowRhombusPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == numRows) {
                for (int k = 1; k <= numRows; k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 1; k <= numRows - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int countConsonants(String word) {
        int consonantCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c >= 'a' && c <= 'z' && !isVowel(c)) {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        char firstChar = password.charAt(0);
        if (!Character.isLetter(firstChar)) {
            return false;
        }
        int alphabeticCount = 0;
        int numericCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabeticCount++;
            } else if (Character.isDigit(c)) {
                numericCount++;
            }
        }
        return alphabeticCount >= 4 && numericCount >= 3;
    }
}
