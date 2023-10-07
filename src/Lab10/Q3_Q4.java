package Lab10;

//import java.util.ArrayList;
//
//interface Observer {
//    abstract void update(Observable o, Object arg);
//}
//
//class Observable{
//    private Boolean changed;
//    private ArrayList<Observer> observers = new ArrayList<>();
//    public void addObserver(Observer m) {
//        this.observers.add(m);
//    }
//    public void deleteObserver(Observer m) {
//        this.observers.remove(m);
//    }
//    public int countObservers() {
//        return this.observers.size();
//    }
//
//    public void setChanged() {
//        this.changed = true;
//    }
//    public void clearChanged() {
//        changed = false;
//    }
//
//    public boolean hasChanged() {
//        return changed;
//    }
//    public void notifyObservers(Object message) {
//        if (hasChanged()) {
//            clearChanged();
//            for (Observer obs : observers) {
//                obs.update(this, message);
//            }
//        }
//    }
//}
//class Guest implements Observer {
//    private String name;
//    public Guest(String name) {
//        this.name = name;
//    }
//    public void update(Observable o, Object message) {
//        System.out.printf("To %s, %s\n", name, message);
//    }
//}
//
//class PartyOrganizer extends Observable {
//    private String title;
//    PartyOrganizer(String title) {
//        this.title = title;
//    }
//    public void registerGuest(String name) {
//        setChanged();
//        Guest newGuest = new Guest(name);
//        addObserver(newGuest);
//        notifyObservers(name + " has arrived at the " + title);
//    }
//}


public class Q3_Q4 {
    public static void main(String[] args) {
        PartyOrganizer observable  = new PartyOrganizer("21st Birthday Party");
        observable.registerGuest("Bob");
        observable.registerGuest("Peter");
    }
}
