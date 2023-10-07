package Lab10;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings( "deprecation" )
class Guest implements Observer {
    private String name;
    public Guest(String name) {
        this.name = name;
    }
    public void update(Observable o, Object message) {
        System.out.printf("To %s, %s\n", name, message);
    }
}

@SuppressWarnings( "deprecation" )
class PartyOrganizer extends Observable{
    private String title;
    PartyOrganizer(String title) {
        this.title = title;
    }
    public void registerGuest(String name) {
        setChanged();
        Guest newGuest = new Guest(name);
        addObserver(newGuest);
        notifyObservers(name + " has arrived at the " + title);
    }
}

public class Q1_Q2 {
    public static void main(String[] args) {
        PartyOrganizer observable  = new PartyOrganizer ("21st Birthday Party");
        observable.registerGuest("Bob");
        observable.registerGuest("Peter");
    }
}
