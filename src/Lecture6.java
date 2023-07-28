import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Lecture6 {
    public static void main(String[] args) {
//        System.out.println(countEvens(new int[] {2, 4, 16, 80}));

//        System.out.println(getNumberOfDays(12));

//        int[] numbers = {0, 1, 2};
//        incrementByOne(numbers);
//        System.out.println(Arrays.toString(numbers));

//        int[] source = new int[]{1, 2, 3};
//        int[] array = getArrayOfSquares(source);
//        System.out.println(Arrays.toString(source));
//        System.out.println(Arrays.toString(array ));

//        int[] array = {0,2,4,6,8};
//        changeArray(array, array[1]);
//        System.out.println(Arrays.toString(array));

//        int[][] numbers = {{2, 4, 16, 80, 27}, {1, 4, 120, 18, 7}, {20, 14, 70, 8, 130}};
//        System.out.println(sumOver(numbers, 20));

//        String[] array = new String[]{"mobody", "goes", "to", "that", "restaurant", "because", "it", "is", "too", "crowded"};
//        System.out.println(startWithVowelCount(array));

//        ArrayList<Point> list = new ArrayList<Point>();
//        Point pt1 = new Point(3, 4);
//        list.add( pt1 );
//        Point pt2 = (Point) list.get( 0 );
//        pt2.x = 23;
//        System.out.println( pt1 == pt2 );

        ArrayList<Integer> a_list = new ArrayList<>(Arrays.asList(9, 21, 6, -34, 29, 1, -4));
        removePositives(a_list);
        System.out.println(a_list);
    }
    public static int countEvens(int[] numbers){
        int count = 0;
        for (int i: numbers){
            if (i % 2 == 0){
                count += 1;
            }
        }
        return count;
    }

    public static int getNumberOfDays(int month){
        int[] numberOfDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return numberOfDays[month-1];
    }

    public static void incrementByOne(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            numbers[i] += 1;
        }
    }

    public static int[] getArrayOfSquares(int[] numbers){
        int[] l = new int[numbers.length];
        for (int i=0; i< numbers.length; i++){
            l[i] = (int) Math.pow(numbers[i], 2);
        }
        return l;
    }

    public static void changeArray(int[] passedArray, int value){
        passedArray[value] = 12;
        value = 5;
    }

    public static int sumOver(int[][] values, int target){
        int sum = 0;
        for (int[] i: values){
            for (int j: i){
                if (j > target){
                    sum += j;
                }
            }
        }
        return sum;
    }

    public static int startWithVowelCount(String[] words){
        int count = 0;
        for (String i: words){
            if (i.startsWith("a") || i.startsWith("e") || i.startsWith("i") || i.startsWith("o") || i.startsWith("u"))
                count += 1;
        }
        return count;
    }

    public static void removePositives(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 0) {
                iterator.remove();
            }
        }

        //Shortcut
        //numbers.removeIf(number -> number > 0);

    }
}
