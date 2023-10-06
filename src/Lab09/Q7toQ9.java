package Lab09;

import java.util.ArrayList;

abstract class MyRectangle extends java.awt.Rectangle {
    public MyRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public abstract void draw(String indent);
    @Override
    public String toString() {
        return this.getClass().getName() + ":(" + this.x + "," + this.y + ")";
    }
}

class SimpleRectangle extends MyRectangle {
    public SimpleRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(String indent) {
        System.out.println(indent + this);
    }
}

class ContainerRectangle extends MyRectangle {
    private ArrayList<MyRectangle> elements;
    public ContainerRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
        elements = new ArrayList<>();
    }

    public boolean add(MyRectangle rectangle) {
        for (MyRectangle element : elements) {
            if (element.intersects(rectangle)) {
                return false;
            }
        }
        if (rectangle.x >= x && rectangle.y >= y  && (rectangle.x + rectangle.width) <= (x+width) && (rectangle.y + rectangle.height) <= (y+height)){
            return elements.add(rectangle);
        }
        return false;
    }

    public boolean remove(MyRectangle rectangle) {
        return elements.remove(rectangle);
    }

    @Override
    public void draw(String indent) {
        System.out.println(indent + this);
        for (MyRectangle rectangle : elements) {
            rectangle.draw(indent + " ");
        }
    }
}

public class Q7toQ9 {
}
