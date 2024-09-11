package edu.metrostate.todolist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void getUndoneItems() {
        ToDoList list = new ToDoList();

        assertEquals(0, list.getUndoneItems().size());

        ToDoListItem item = new ToDoListItem("My task");
        list.add(item);
        assertEquals(1, list.getUndoneItems().size());
        assertSame(item, list.get(0));

        item.setDone(true);

        assertEquals(0, list.getUndoneItems().size());

    }

    @Test
    void clearDoneItems() {
        ToDoList list = new ToDoList();
        ToDoListItem item = new ToDoListItem("My task");
        list.add(item);

        assertEquals(1, list.size());

        list.clearCompleteItems();

        assertEquals(1, list.size());

        item.setDone(true);
        list.clearCompleteItems();

        assertEquals(0, list.size());

        list.add(new ToDoListItem("Test 1"));
        list.add(new ToDoListItem("Test 2"));
        list.add(new ToDoListItem("Test 3"));

//        list.get(1).setDone(true);
        list.clearCompleteItems();
        assertEquals(2, list.size());
    }


}