package Lecture15;

public class Q4 {
    public static int getSum(String[] values) {
        int result = 0;
        for (String s: values)
            try {
                result += Integer.parseInt(s);
            } catch (Exception e){
                System.out.println("Error: Invalid value!");
                break;
            }

        return result;
    }
    public static void main(String[] args) {
        String[] array = new String[]{ "1", "2", "A", "B", "4"};
        System.out.println("The result is: " + getSum(array));
    }
}
