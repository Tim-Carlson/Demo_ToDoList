package edu.metrostate.todolist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MultiStepToDoItemTest {

    @Test
    void testToString() {
        ToDoListItem step1 = new ToDoListItem("First Step");
        ToDoListItem step2 = new ToDoListItem("Second Step");
        List<ToDoListItem> steps = new ArrayList<>();
        steps.add(step1);
        steps.add(step2);
        MultiStepToDoItem item = new MultiStepToDoItem("Multistep", steps);

        String result = item.toString();

        assertEquals("Multistep\n1. First Step\n2. Second Step\n", result);


    }
}