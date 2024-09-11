package edu.metrostate.todolist;

import java.util.ArrayList;
import java.util.List;

public class Category extends ArrayList<IDisplayItem> implements IDisplayItem{

    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category(String categoryName, List<ToDoListItem> items) {
        this.categoryName = categoryName;
        this.addAll(items);
    }

    @Override
    public String getItemName() {
        return categoryName;
    }

    @Override
    public boolean isDone() {
        boolean isDone = true;
        for(IDisplayItem item : this) {
            isDone &= item.isDone();
        }
        return isDone;
    }

    @Override
    public List<IDisplayItem> getChildren() {
        return this;
    }

    @Override
    public String toString() {
        return categoryName;
    }
}
