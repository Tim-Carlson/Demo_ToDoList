package edu.metrostate.todolist;

import java.util.ArrayList;
import java.util.List;

public class MultiStepToDoItem extends ToDoListItem {

    private List<ToDoListItem> subSteps = new ArrayList<>();

    public MultiStepToDoItem(String name, List<ToDoListItem> steps) {
        super(name);

        subSteps.addAll(steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getItemName());
        sb.append("\n");
        int index = 1;
        for(ToDoListItem item : subSteps) {
            sb.append(index++).append(". ").append(item.getItemName());
            sb.append("\n");
        }


        return sb.toString();
    }

    @Override
    public boolean isDone() {
        boolean isDone = true;
        for(ToDoListItem item : subSteps) {
            isDone &= item.isDone();
        }
        return isDone;
    }

    @Override
    public void setDone(boolean done) {
        for(ToDoListItem item : subSteps) {
            item.setDone(done);
        }
    }

    @Override
    public List<IDisplayItem> getChildren() {
        return new ArrayList<>(subSteps);
    }
}
