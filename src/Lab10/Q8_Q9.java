package Lab10;

import javax.swing.*;
import java.util.ArrayList;

class Student {
    private String name, username;
    public Student(String name, String username) {
        this.name = name;
        this.username = username;
    }
    public String toString() { return String.format("%s(%s)", name, username); }
    public String getUsername() { return username; }
    public String getName() { return name; }
}

class StudentListModel<Student> extends AbstractListModel<Student> {
    private ArrayList<Student> items;

    StudentListModel() {
        items = new ArrayList<>();
    }
    @Override
    public int getSize() {
        return this.items.size();
    }

    @Override
    public Student getElementAt(int index) {
        return this.items.get(index);
    }

    public void addElement(Student s) {
        items.add(s);
        fireIntervalAdded(this, getSize()-1, getSize()-1);
    }
    public void removeElementAt(int index) {
        items.remove(index);
        fireIntervalRemoved(this, index, index);
    }

    public void addAll(ArrayList<Student> values) {
        for (Student s:values){
            this.addElement(s);
            // fireIntervalAdded(this, items.size() - 1, items.size() - 1);
        }

    }
}
public class Q8_Q9 {
    public static void main(String[] args) {

    }
}
