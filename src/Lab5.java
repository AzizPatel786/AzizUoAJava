import java.util.ArrayList;

class MySimpleSquare{
    private int sideLength;
    public MySimpleSquare(){
        this.sideLength = 1;
    }
    public MySimpleSquare(int sl){
        this.sideLength = sl;
    }
    public int getArea(){
        return this.sideLength * this.sideLength;
    }
    public int getPerimeter(){
        return this.sideLength * 4;
    }

    @Override
    public String toString() {
        return getClass().getName() + ", area=" + getArea();
    }
}

class MySimpleCube{
    private MySimpleSquare base;
    private int sideLength;
    public MySimpleCube(){
        this.base = new MySimpleSquare();
        this.sideLength = 1;
    }
    public MySimpleCube(int sl){
        this.base = new MySimpleSquare(sl);
        this.sideLength = sl;
    }
    public int getVolume(){
        return (int) Math.pow(this.sideLength, 3);
    }
    public int getSurfaceArea(){
        return (int) (6 * Math.pow(this.sideLength, 2));
    }

    @Override
    public String toString() {
        return getClass().getName() + ", volume=" + getVolume();
    }
}

class ParkingSpace{
    private int spaceId;
    private boolean available;
    public ParkingSpace(){
        this.spaceId = 1;
        this.available = true;
    }
    public ParkingSpace(int sId){
        this.spaceId = sId;
        this.available = true;
    }

    public int getSpaceId() {
        return this.spaceId;
    }

    public boolean isAvailable() {
        return this.available;
    }
    public void markAsOccupied(){
        this.available = false;
    }

    @Override
    public String toString() {
        if (this.available){
            return "Parking Space " + this.spaceId + ": available";
        }
        return "Parking Space " + this.spaceId + ": occupied";
    }
}

class ParkingSlot{
    private ArrayList<ParkingSpace> parkingSpaces;
    public ParkingSlot(){
        this.parkingSpaces = new ArrayList<ParkingSpace>();
        this.parkingSpaces.add(new ParkingSpace(0));
    }
    public ParkingSlot(int slotCount){
        this.parkingSpaces = new ArrayList<ParkingSpace>();
        for (int i = 0; i < slotCount; i++) {
            this.parkingSpaces.add(new ParkingSpace(i));
        }
    }
    public int checkAvailability(){
        int count = 0;
        for (ParkingSpace ps: parkingSpaces){
            if (ps.isAvailable()){
                count ++;
            }
        }
        return count;
    }
    public ParkingSpace getAvailable(){
        for (ParkingSpace ps: parkingSpaces){
            if (ps.isAvailable()){
                return ps;
            }
        }
        return null;
    }
    public void markAsOccupied(){
        for (ParkingSpace ps: parkingSpaces){
            if (ps.isAvailable()){
                ps.markAsOccupied();
                return;
            }
        }
        System.out.println("Sorry, this parking slot is full.");
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Parking Slot:\n");
        string.append("[");
        int length = 0;
        for (ParkingSpace ps: parkingSpaces){
            if (length++ < parkingSpaces.size() - 1) {
                string.append(ps.toString()).append(", ");
            }else {
                string.append(ps.toString());
            }
        }
        return string.append("]").toString();
    }
}

class MySquare{
    protected int sideLength;
    public MySquare(){
        this.sideLength = 1;
    }
    public MySquare(int sl){
        this.sideLength = sl;
    }

    public int getSideLength() {
        return sideLength;
    }
    public int getArea(){
        return this.sideLength * this.sideLength;
    }
    public int getPerimeter(){
        return this.sideLength * 4;
    }

    @Override
    public String toString() {
        return getClass().getName() + ", area=" + getArea();
    }
    @Override
    public boolean equals(Object other){
        return (other instanceof MySquare) && (((MySquare) other).getSideLength() == getSideLength());
    }
}

class MySubCube extends MySquare{
    public MySubCube(){
        super();
    }
    public MySubCube(int sl){
        super(sl);
    }

    public int getVolume(){
        return (int) Math.pow(this.getSideLength(), 3);
    }
    public int getSurfaceArea(){
        return (int) (6 * Math.pow(this.getSideLength(), 2));
    }

    @Override
    public String toString() {
        return getClass().getName() + ", volume=" + getVolume();
    }
}

abstract class MyFrustumShape{
    protected int height;
    public MyFrustumShape(){
        this.height = 1;
    }
    public MyFrustumShape(int h){
        this.height = h;
    }

    public int getHeight() {
        return this.height;
    }
    public abstract double getTopArea();
    public abstract double getBottomArea();
    public double getVolume(){
        double v;
        v = ((double) getHeight() /3) * (getTopArea() + getBottomArea() + Math.sqrt((getTopArea() * getBottomArea())));
        return v;
    }
    @Override
    public String toString(){
        return getClass().getName() + String.format(", volume=%.2f", getVolume());
    }
}

class MyFrustumPyramid extends MyFrustumShape{
    private int topSideLength;
    private int bottomSideLength;
    public MyFrustumPyramid(){
        super(1);
        this.topSideLength = 1;
        this.bottomSideLength = 1;
    }
    public MyFrustumPyramid(int topSideLength, int bottomSideLength, int h){
        super(h);
        this.topSideLength = topSideLength;
        this.bottomSideLength = bottomSideLength;
    }
    @Override
    public double getTopArea(){
        return this.topSideLength * this.topSideLength;
    }
    @Override
    public double getBottomArea(){
        return this.bottomSideLength * this.bottomSideLength;
    }
}

class MyFrustumConee extends MyFrustumShape{
    private int topRadius;
    private int bottomRadius;
    public MyFrustumConee(){
        super(1);
        this.topRadius = 1;
        this.bottomRadius = 1;
    }
    public MyFrustumConee(int topRadius, int bottomRadius, int h){
        super(h);
        this.topRadius = topRadius;
        this.bottomRadius = bottomRadius;
    }
    @Override
    public double getTopArea(){
        return this.topRadius * this.topRadius * Math.PI;
    }
    @Override
    public double getBottomArea(){
        return this.bottomRadius * this.bottomRadius * Math.PI;
    }
}
public class Lab5{
    public static void main(String[] args) {
        // Question 1
//        MySimpleSquare p = new MySimpleSquare();
//        System.out.println(p);
//        MySimpleSquare p2 = new MySimpleSquare(5);
//        System.out.println(p2);
//        System.out.println(p == p2);
//        System.out.println(p.equals(p2));
//        System.out.println(p);
//        System.out.printf("%d, %d\n", p.getArea(), p.getPerimeter());
        // Question 2
//        MySimpleCube p = new MySimpleCube();
//        System.out.println(p);
//        MySimpleCube p2 = new MySimpleCube(5);
//        System.out.println(p2);
//        System.out.println(p == p2);
//        System.out.println(p.equals(p2));
//        System.out.println(p);
//        System.out.printf("%d, %d\n", p.getSurfaceArea(), p.getVolume());
        // Question 3
//        ParkingSpace space1 = new ParkingSpace();
//        System.out.println(space1.getSpaceId());
//        System.out.println(space1.isAvailable());
//        ParkingSpace space2 = new ParkingSpace(2);
//        System.out.println(space2.getSpaceId());
//        System.out.println(space2.isAvailable());
//        space1.markAsOccupied();
//        System.out.println(space1);
//        System.out.println(space2);
        // Question 4
//        ParkingSlot slot1 = new ParkingSlot();
//        System.out.println(slot1.checkAvailability());
//        ParkingSlot slot2 = new ParkingSlot(5);
//        System.out.println(slot2.checkAvailability());
        // Question 5
//        ParkingSlot slot1 = new ParkingSlot(2);
//        System.out.println(slot1);
//        slot1.markAsOccupied();
//        slot1.markAsOccupied();
//        System.out.println(slot1.checkAvailability());
//        System.out.println(slot1.getAvailable());
//        slot1.markAsOccupied();
        // Question 6
//        MySquare t1 = new MySquare();
//        System.out.println(t1.getSideLength());
//        MySquare t2 = new MySquare(1);
//        System.out.println(t1 == t2);
        // Question 7
//        MySquare t1 = new MySquare();
//        System.out.println(t1);
//        MySquare t2 = new MySquare(5);
//        System.out.println(t2);
//        MySquare t3 = new MySquare(5);
//        System.out.println(t3);
//        System.out.println(t1.equals(t2));
//        System.out.println(t1 == t2);
//        System.out.println(t2.equals(t3));
//        System.out.println(t2 == t3);
        // Question 8
//        MySquare[] array = new MySquare[]{new MySubCube(), new MySubCube(5), new MySubCube(10)};
//        for (MySquare s: array) System.out.println(s.getSideLength());
        // Question 9
//        MySubCube t1 = new MySubCube();
//        System.out.println(t1);
//        MySubCube t2 = new MySubCube(5);
//        System.out.println(t2);
//        MySubCube t3 = new MySubCube(5);
//        System.out.println(t3);
//        System.out.println(t1.getSurfaceArea());
//        System.out.println(t2.getSurfaceArea());
//        System.out.println(t3.getSurfaceArea());
        // Question 10
//        MyFrustumShape t1 = new MyFrustumPyramid();
//        System.out.println(t1.getHeight());
//        MyFrustumShape t2 = new MyFrustumPyramid(3, 4, 5);
//        System.out.println(t2.getHeight());
        // Question 11
//        MyFrustumPyramid t1 = new MyFrustumPyramid();
//        System.out.println(t1);
//        System.out.printf("%.2f, %.2f\n", t1.getTopArea(), t1.getBottomArea());
//        MyFrustumPyramid t2 = new MyFrustumPyramid(3, 4, 5);
//        System.out.println(t2);
//        System.out.printf("%.2f, %.2f", t2.getTopArea(), t2.getBottomArea());
        // Question 12
//        MyFrustumPyramid t1 = new MyFrustumPyramid();
//        System.out.println(t1);
//        System.out.printf("%.2f, %.2f\n", t1.getTopArea(), t1.getBottomArea());
//        MyFrustumPyramid t2 = new MyFrustumPyramid(3, 4, 5);
//        System.out.println(t2);
//        System.out.printf("%.2f, %.2f", t2.getTopArea(), t2.getBottomArea());
        // Question 13
//        MyFrustumCone t1 = new MyFrustumCone();
//        System.out.println(t1);
//        System.out.printf("%.2f, %.2f\n", t1.getTopArea(), t1.getBottomArea());
//        MyFrustumCone t2 = new MyFrustumCone(3, 4, 5);
//        System.out.println(t2);
//        System.out.printf("%.2f, %.2f", t2.getTopArea(), t2.getBottomArea());



    }
}