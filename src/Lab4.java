import java.util.ArrayList;
import java.util.Arrays;

class MyFrustumCone{
    private int topRadius, bottomRadius, height;
    public MyFrustumCone(){
        this.topRadius = 1;
        this.bottomRadius = 1;
        this.height = 1;
    }
    public MyFrustumCone(int topRadius, int bottomRadius, int height){
        this.topRadius = topRadius;
        this.bottomRadius = bottomRadius;
        this.height = height;
    }
    public int getTopRadius(){
        return this.topRadius;
    }
    public int getBottomRadius(){
        return this.bottomRadius;
    }
    public int getHeight(){
        return this.height;
    }
    public void setHeight(int h){
        if (h > 0){
            this.height = h;
        }
    }
    public double getVolume(){
        return Math.PI * this.height * ((double) (getTopRadius() * getTopRadius() + getTopRadius() * getBottomRadius() + getBottomRadius() * getBottomRadius()) /3);
    }
    @Override
    public String toString(){
        return String.format("MyFrustumCone, volume=%.2f", getVolume());
    }
}

class PolygonalNumber {
    private int[] numbers;
    public PolygonalNumber(){
        numbers = new int[]{1};
    }
    public PolygonalNumber(int s, int n){
        numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = (int) ((((s - 2)* Math.pow(i+1, 2)) - ((s - 4) * (i+1)))/2);
        }
    }
    public int[] getNumbers(){
        return numbers;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.numbers.length; i++){
            s.append(this.numbers[i]);
            if (i < this.numbers.length - 1){
                s.append(", ");
            }
        }
        s.append("]");
        return s.toString();
    }
}

class TicTacToe{
    private char[][] board;
    public static final int SIZE = 3;
    public TicTacToe(){
        board = new char[3][3];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public TicTacToe(String moves){
        board = new char[SIZE][SIZE];
        int index = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = moves.charAt(index++);
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result.append(board[i][j]);
            }
            result.append("\n---\n");
        }
        return result.toString();
    }

    public Boolean checkWin(char target){
        // Check rows
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == target && board[i][1] == target && board[i][2] == target) {
                return true;
            }
        }
        // Check cols
        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] == target && board[1][j] == target && board[2][j] == target) {
                return true;
            }
        }
        // Check diags
        if (board[0][0] == target && board[1][1] == target && board[2][2] == target) {
            return true;
        }
        if (board[0][2] == target && board[1][1] == target && board[2][0] == target) {
            return true;
        }

        return false;
    }
}

enum ChineseYear{
    MONKEY, ROOSTER, DOG, PIG, RAT, OX, TIGER, HARE, DRAGON, SNAKE, HORSE, SHEEP;
    public static ChineseYear valueOf(int year){
        return ChineseYear.values()[year % 12];
    }
}

enum ShapeType{
    TRIANGLE(3), SQUARE(4), PENTAGON(5), HEXAGON(6);
    private int sideCount;
    private ShapeType(int numberOfSides) {
        this.sideCount = numberOfSides;
    }
    public int getPerimeter(int sideLength) {
        return sideCount * sideLength;
    }
}

class Author {
    private String name;
    public Author(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
}

class Book {
    private String name;
    private ArrayList<Author> authors;

    public Book(String name) {
        this.name = name;
        authors = new ArrayList<Author>();
    }
    @Override
    public String toString() {
        if (authors.isEmpty()) {
            return name;
        }
        return String.format("%s by %s", name, authors.toString());
    }
    public void addAuthor(Author author) {
        authors.add(author);
    }
    public int getNumberOfAuthors() {
        return authors.size();
    }
    public String getName() {
        return name;
    }
}


public class Lab4 {
//    enum ShapeType { TRIANGLE, SQUARE, PENTAGON, HEXAGON;
//        public static int getPerimeter(ShapeType s, int sideLength){
//            switch (s) {
//                case TRIANGLE -> {
//                    return sideLength * 3;
//                }
//                case SQUARE -> {
//                    return sideLength * 4;
//                }
//                case PENTAGON -> {
//                    return sideLength * 5;
//                }
//                case HEXAGON -> {
//                    return sideLength * 6;
//                }
//            }
//            return -1;
//        }
//    }
    enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    }
    public static boolean isWeekEnd(Day value){
        return value.ordinal() >= 5;
    }


    public static void main(String[] args) {
        // Question 1
//        MyFrustumCone p = new MyFrustumCone();
//        System.out.println(p.getClass().getName());
//        System.out.println(p.getHeight());
//        p.setHeight(-100);
//        System.out.println(p.getHeight());
//        p.setHeight(0);
//        System.out.println(p.getHeight());
//        p.setHeight(10);
//        System.out.println(p.getHeight());
//        System.out.println(p.getTopRadius());
//        System.out.println(p.getBottomRadius());
        // Question 2
//        MyFrustumCone p = new MyFrustumCone();
//        System.out.println(p.getClass().getName());
//        System.out.println(p);
        // Question 3
//        PolygonalNumber p = new PolygonalNumber();
//        System.out.println(p.getClass().getName());
//        System.out.println(Arrays.toString(p.getNumbers()));
//        PolygonalNumber p2 = new PolygonalNumber();
//        System.out.println(p2.getClass().getName());
//        System.out.println(Arrays.toString(p2.getNumbers()));
//        System.out.println(p == p2);
        // Question 4
//        PolygonalNumber p = new PolygonalNumber();
//        System.out.println(p);System.out.println(Arrays.toString(p.getNumbers()));
//        PolygonalNumber p2 = new PolygonalNumber(3, 4);
//        System.out.println(p2);System.out.println(Arrays.toString(p2.getNumbers()));
//        System.out.println(p == p2);
        // Question 5
//        TicTacToe c1 = new TicTacToe();
//        System.out.println("START");
//        System.out.println(c1);
//        System.out.println(c1.SIZE);
//        TicTacToe c1 = new TicTacToe("O X O X X");
//        System.out.println(c1);
        // Question 9
//        System.out.printf("%d\n", getPerimeter(ShapeType.TRIANGLE, 4));
//        System.out.printf("%d\n", getPerimeter(ShapeType.SQUARE, 4));
        // Question 10
//        System.out.println(isWeekEnd(Day.MONDAY));
//        System.out.println(isWeekEnd(Day.SUNDAY));
//        System.out.println(isWeekEnd(Day.THURSDAY));
        // Question 11
//        System.out.println(ChineseYear.valueOf(2003));
//        System.out.println(ChineseYear.valueOf(2023));
//        System.out.println(ChineseYear.valueOf(2000));
//        System.out.println(ChineseYear.valueOf(2001));
        // Question 12
        ShapeType current = ShapeType.SQUARE;
        System.out.println(current);
        System.out.println(current.getPerimeter(5));
    }
}