package Lecture9;

public class SimpleRectangle {
    public static void main(String[] args) {
        SimpleRectangle p1 = new SimpleRectangle(10, 5);
        System.out.println(p1);
        SimpleRectangle p2 = new SimpleRectangle(10, 5);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
    private int width=1;
    private int height=1;
    public SimpleRectangle() { this(1, 1);}
    public SimpleRectangle(int b, int h) { width = b; height=h; }
    public String toString() { return String.format("Rectangle, area=%.2f", this.getArea()); }
    public double getArea() {
        return width * height;
    }
    @Override
    public boolean equals(Object obj){
        return (obj instanceof SimpleRectangle) && (((SimpleRectangle)obj).width == width) && (((SimpleRectangle)obj).height == height);
    }
}
