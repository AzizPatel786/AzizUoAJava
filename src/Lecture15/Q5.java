package Lecture15;

public class Q5 {
    public static int getSum(String[] values) {
        int result = 0;
        for (String s: values)
            try {
                result += Integer.parseInt(s);
            } catch (Exception e){
                continue;
            }
        return result;
    }
}
