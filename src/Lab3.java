import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab3 {
    public static void main(String[] args) {
        // Question 1
//        int[] result = createEvenArray(10);
//        System.out.println(Arrays.toString(result));
        // Question 2
//        System.out.println(getSumPositiveOdds(new int[]{-1,2,-3,4,5}));
        // Question 3
//        int[] numbers = new int[]{51, 65, 66, 11, 80, 10, 9};
//        System.out.println(getIndexOfLargestMultipleOf3(numbers));
//        int[] data = new int[]{51, 65, 66, 97};
//        System.out.println(getIndexOfLargestMultipleOf3(data));
        // Question 4
//        System.out.println(noNegatives(new int[]{1, 3, 5, 7}));
        // Question 5
//        int[] array = {2, 5, 3, 8, 1};
//        int[] data = getDifferenceArray(array);
//        System.out.println(Arrays.toString(data));
        // Question 6
//        String[][] result = generate2DArray("powerful");
//        for (String[] array: result) System.out.println(Arrays.toString(array));
        // Question 7
//        int[][] nums = {{0, 1, 2, 3}, {2, 4, 6, -8}, {3, 6, 9, -12}};
//        System.out.println(getColMax(nums, 0));
//        System.out.println(getColMax(nums, 1));
//        System.out.println(getColMax(nums, 2));
        // Question 8
//        List<Integer> result = getNegativeEvens(new int[]{1, 2, -3, -4, 5, 6, 7, 8, 9, 10, -1, -2});
//        System.out.println(result);
        // Question 9
//        List<Integer> a_list = Arrays.asList(3, 2, 4, 7);
//        runningSum(a_list);
//        for (int num: a_list) System.out.printf("%d ", num);
        // Question 10
//        String[] words = new String[]{"fish", "barrel", "like", "shooting", "sand", "bank"};
//        List<String> arrayList = new ArrayList<String>(Arrays.asList(words));
//        System.out.println(countShortestString(arrayList));
        // Question 11
//        int[][] array = {{1}, {1, 2, 3}, {2, 4}};
//        List<Integer> numbers = getOneDimensionalUnique(array);
//        System.out.println(numbers);
        // Question 12
//        List<Integer> arrayList = new ArrayList<Integer>();
//        Collections.addAll(arrayList, -3, -5, 6, 24, -7, -9, 1, 8, 28, -11);
//        removeNegativeAndEvens(arrayList);
//        System.out.println(arrayList);
    }

    public static int[] createEvenArray(int maxValue){
        int[] even_ints = new int[maxValue/2];
        int value = 2;
        for (int i=0; i < even_ints.length; i++){
            even_ints[i] = value;
            value += 2;
        }
        return even_ints;
    }

    public static int getSumPositiveOdds(int[] numbers){
        int sum = 0;
        for (int num: numbers){
            if (num % 2 != 0 && num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int getIndexOfLargestMultipleOf3(int[] numbers){
        int largest_multiple = -786;
        int index = -1;
        int i = 0;
        for (int num:numbers){
            if (num%3==0 && num > largest_multiple){
                largest_multiple = num;
                index = i;
            }
            i += 1;
        }
        return index;
    }

    public static boolean noNegatives(int[] values){
        for (int num:values){
            if (num < 0){
                return false;
            }
        }
        return true;
    }

    public static int[] getDifferenceArray(int[] numbers){
        int[] diff_array = new int[numbers.length];
        int i = 0;
        for (int n:numbers){
            if (i == 0){
                diff_array[i] = n;
            }else {
                diff_array[i] = n - numbers[i-1];
            }
            i+= 1;
        }
        return diff_array;
    }

    public static String[][] generate2DArray(String word){
        int length = word.length();
        String[][] words = new String[length][];
        for (int i = 0; i < length; i++){
            words[i] = new String[length-i];
            for (int j = 0; j < length - i; j++){
                words[i][j] = word.substring(0, j + 1);
            }
        }
        return words;
    }

    public static int getColMax(int[][] numbers, int colIndex){
        int colMax = (int) (-1.0/0.0);
        for (int[] num: numbers){
            if (num[colIndex] > colMax){
                colMax = num[colIndex];
            }
        }
        return colMax;
    }

    public static List<Integer> getNegativeEvens(int[] numbers){
        ArrayList<Integer> even_negatives = new ArrayList<Integer>();
        for (int num: numbers){
            if (num%2 == 0 && num < 0){
                even_negatives.add(num);
            }
        }
        return even_negatives;
    }

    public static void runningSum(List<Integer> numbers){
        for (int i = 1; i < numbers.size(); i++){
            numbers.set(i, numbers.get(i-1) + numbers.get(i));
        }
    }

    public static int countShortestString(List<String> words){
        int shortest_length = 9999;
        ArrayList<String> shortest_word = new ArrayList<String>();
        for (String word:words){
            if (word.length() < shortest_length) {
                shortest_word.clear();
                shortest_word.add(word);
                shortest_length = word.length();
            } else if (word.length() == shortest_length) {
                shortest_word.add(word);
            }
        }
        return shortest_word.size();
    }

    public static List<Integer> getOneDimensionalUnique(int[][] array){
        List<Integer> unique_nums = new ArrayList<Integer>();
        for (int[] inner_list: array){
            for (int num: inner_list){
                if (!unique_nums.contains(num)){
                    unique_nums.add(num);
                }
            }
        }
        return unique_nums;
    }

    public static void removeNegativeAndEvens(List<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) < 0 && numbers.get(i) % 2 == 0){
                numbers.remove(i);
            }
        }
    }
}
