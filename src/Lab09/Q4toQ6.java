package Lab09;

import java.util.ArrayList;
import java.util.List;

abstract class Task {
    protected String name;
    protected int timeRequired;
    public Task(String name, int timeRequired) {
        this.name = name;
        this.timeRequired = timeRequired;
    }
    public String getName() {
        return name;
    }
    public abstract int getTimeRequired();
}

class SimpleTask extends Task {
    public SimpleTask(String name, int timeRequired) {
        super(name, timeRequired);
    }
    @Override
    public int getTimeRequired() {
        return timeRequired;
    }
}
class CompositeTask extends Task {
    private List<Task> items;

    public CompositeTask(String name, int timeRequired) {
        super(name, timeRequired);
        items = new ArrayList<>();
    }
    public void add(Task task) {
        items.add(task);
    }
    public void remove(Task task) {
        items.remove(task);
    }
    @Override
    public int getTimeRequired() {
        int totalTime = timeRequired;
        for (Task item : items) {
            totalTime += item.getTimeRequired();
        }
        return totalTime;
    }
}
public class Q4toQ6 {
}
