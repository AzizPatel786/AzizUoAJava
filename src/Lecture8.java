import java.util.ArrayList;

class SimpleRectangle{
    private int height, width;
    public SimpleRectangle(){
        this.height = 1;
        this.width = 1;
    }
    public SimpleRectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    @Override
    public String toString(){
        return String.format("Rectangle, area=%.2f", getArea());
    }
}

class SimpleTriangle{
    private int height, base;
    public SimpleTriangle(){
        this.height = 1;
        this.base = 1;
    }
    public SimpleTriangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double getArea(){
        return this.base * this.height * 0.5;
    }
    @Override
    public String toString(){
        return String.format("Triangle, area=%.2f", getArea());
    }
}

class TriangularPrism{
    private int base, height, side, length;
    private SimpleTriangle triangle;
    private SimpleRectangle sideRect;
    private SimpleRectangle bottomRect;
    public TriangularPrism(){
        this.base = 1;
        this.height = 1;
        this.side = 2;
        this.length = 10;
        this.triangle = new SimpleTriangle(base, height);
        this.sideRect = new SimpleRectangle(side, length);
        this.bottomRect = new SimpleRectangle(base, length);
    }
    public TriangularPrism(int base, int height, int side, int length){
        this.base = base;
        this.height = height;
        this.side = side;
        this.length = length;
        this.triangle = new SimpleTriangle(base, height);
        this.sideRect = new SimpleRectangle(side, length);
        this.bottomRect = new SimpleRectangle(base, length);
    }
    public double getSurfaceArea(){
        return (triangle.getArea() * 2) + (sideRect.getArea() * 2) + bottomRect.getArea();
    }
    @Override
    public String toString(){
        return String.format("Prism, Surface area=%.2f", getSurfaceArea());
    }
}

class Student {
    private String name;
    private int studentId;
    public Student() {
        this.name = "";
        this.studentId = 1;
    }
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return String.format("%s(%d)", name, studentId);
    }
}

class Department{
    private String name;
    private ArrayList<Student> students;
    public Department(){
        this.name = "UNKNOWN";
        this.students = new ArrayList<Student>();
    }
    public Department(String name){
        this.name = name;
        this.students = new ArrayList<Student>();
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    @Override
    public String toString() {
        return String.format("%s(number of students=%d)", this.name, this.students.size());
    }
}

class MyMatrix{
    private int[][] data;
    public final static int SIZE = 3;
    public MyMatrix(){
        this.data = new int[SIZE][SIZE];
    }
    public MyMatrix(int a, int b, int c, int d, int e, int f, int g, int h, int i){
        this.data = new int[][]{{a, b, c}, {d, e, f}, {g, h, i}};
    }
    public MyMatrix(int[] r1, int[] r2, int[] r3){
        this.data = new int[][]{r1, r2, r3};
    }
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (int[] row: this.data){
            string.append("[");
            int count = 0;
            for (int col: row){
                if (count++ >= SIZE-1){
                    string.append(col);
                }else {
                    string.append(col).append(", ");
                }
            }
            string.append("]\n");
        }
        return string.toString();
    }

    public MyMatrix add(MyMatrix element){
        int[][] new_matrix = new int[SIZE][SIZE];
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++){
                new_matrix[i][j] = this.data[i][j] + element.data[i][j];
            }
        }

        return new MyMatrix(new_matrix[0], new_matrix[1], new_matrix[2]);
    }

    public MyMatrix subtract(MyMatrix element){
        int[][] new_matrix = new int[SIZE][SIZE];
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++){
                new_matrix[i][j] = this.data[i][j] - element.data[i][j];
            }
        }

        return new MyMatrix(new_matrix[0], new_matrix[1], new_matrix[2]);
    }
    public MyMatrix multiply(MyMatrix element){
        MyMatrix new_matrix = new MyMatrix();
        for (int row = 0; row < SIZE; row++){
            for (int col = 0; col < SIZE; col++){
                int sum = 0;
                for (int i = 0; i< SIZE; i++){
                    sum += this.data[row][i] * element.data[i][col];
                }
                new_matrix.data[row][col] = sum;
            }
        }
        return new_matrix;
    }
    public void scalar_multiply(int value){
        for (int row = 0; row < SIZE; row++){
            for (int col = 0; col < SIZE; col ++){
                this.data[row][col] *= value;
            }
        }
    }
}

public class Lecture8 {
    public static void main(String[] args) {
        // Question 1
//        SimpleRectangle p = new SimpleRectangle();
//        System.out.println(p);
//        SimpleRectangle p2 = new SimpleRectangle(10, 5);
//        System.out.println(p2);
//        System.out.println(p == p2);
//        System.out.println(p.equals(p2));
//        System.out.println(p2.getWidth());
//        System.out.println(p2.getHeight());
        // Question 2
//        TriangularPrism p = new TriangularPrism(6, 4, 5, 12);
//        System.out.println(p);
//        TriangularPrism p2 = new TriangularPrism();
//        System.out.println(p2);
        // Question 4
//        Student p1 = new Student("Paul", 373);
//        System.out.println(p1);
//        Student s2 = new Student();
//        System.out.println(s2);
        // Question 5
//        Student p1 = new Student("Mia", 123);
//        Student p2 = new Student("Michael", 456);
//        Department cs = new Department("Computer Science");
//        cs.addStudent(p1); cs.addStudent(p2);
//        System.out.println(cs);
//        Department math = new Department();
//        System.out.println(math);
        // Question 6
//        MyMatrix myMatrix2  = new MyMatrix( new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9});
//        System.out.println(myMatrix2);
        // Question 7
//        MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
//        MyMatrix result = myMatrix1.add(myMatrix2);
//        System.out.println(result);
        // Question 8
//        MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
//        MyMatrix result = myMatrix1.subtract(myMatrix2);
//
        // Question 9
//        MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
//        MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        MyMatrix result = myMatrix1.multiply(myMatrix2);
//        System.out.println(result);
        // Question 10
        MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
        MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
        myMatrix1.scalar_multiply(10);
        myMatrix2.scalar_multiply(2);
        System.out.println(myMatrix1);
        System.out.println(myMatrix2);
    }
}