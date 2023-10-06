package Lab07;

public class Q3 {
    public static int getSumEvens(String[] array) {
        int sum = 0;

        for (String s : array) {
            try {
                int num = Integer.parseInt(s);
                if (num % 2 == 0) {
                    sum += num;
                }
            } catch (NumberFormatException e) {
                break;
            }
        }

        return sum;
    }
}
