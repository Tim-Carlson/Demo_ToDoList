package edu.metrostate.todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList extends ArrayList<IDisplayItem> {

    public List<IDisplayItem> getUndoneItems() {
        return this.stream().filter(item -> !item.isDone()).toList();
    }

    public void clearCompleteItems() {
        for(IDisplayItem item : this.stream().toList()) {
            if(item.isDone()) {
                remove(item);
            }
        }
    }

}
