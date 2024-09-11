package edu.metrostate.todolist;

import java.util.List;

public interface IDisplayItem {

    String getItemName();
    boolean isDone();
    List<IDisplayItem> getChildren();

}
