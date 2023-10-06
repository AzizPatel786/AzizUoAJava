package Lecture15;

public class Q6 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 7, 9, 11, 13};
        System.out.println(setValueAt(numbers,10, 4));
    }

    private static boolean setValueAt(int[] numbers, int i, int i1) {
        try {
            numbers[i] = i1;
            return true;
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR: Invalid index");
            return false;
        }
    }
}
