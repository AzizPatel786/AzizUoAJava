package Lab09;

import java.util.ArrayList;

abstract class Person {
    protected String name;
    protected Person parent;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Person getParent() {
        return parent;
    }
    public void setParent(Person parent) {
        this.parent = parent;
    }
    public String getPath() {
        if (getParent() == null) {
            return this.name;
        }
        return getParent().getPath() + "->" + this.name;
    }

    public abstract String toString();
}

class Member extends Person {
    public Member(String n) {
        super(n);
    }
    @Override
    public String toString() {
        return super.name;
    }
}

class ProjectLeader extends Person {
    private ArrayList<Person> list;
    private String projectName;
    public ProjectLeader(String pname, String name){
        super(name);
        projectName = pname;
        list = new ArrayList<>();
    }
    public boolean add(Person p) {
        if (list.size() < 3) {
            p.setParent(this);
            return list.add(p);
        }
        return false;
    }
    public void remove(Person p) {
        list.remove(p);
        p.setParent(null);
    }
    @Override
    public String toString() {
        return projectName + "(" + super.name + "): " + list.toString();
    }
}

public class Q10toQ13 {
}
