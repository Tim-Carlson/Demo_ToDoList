package edu.metrostate.todolist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListItemTest {

    @Test
    void getItemName() {

        ToDoListItem item = new ToDoListItem("My task");


        String itemName = item.getItemName();

        assertEquals("My task", itemName);
        assertEquals(item.toString(), itemName);
    }

    @Test
    void setDone() {
        ToDoListItem item = new ToDoListItem("My task");

        item.setDone(true);

        assertTrue(item.isDone());

    }
}