package edu.metrostate.todolist;

import java.util.List;

public class ToDoListItem implements IDisplayItem {

    private final String itemName;
    private boolean isDone;

    public ToDoListItem(String name) {
        itemName = name;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public List<IDisplayItem> getChildren() {
        return List.of();
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return itemName;
    }
}
