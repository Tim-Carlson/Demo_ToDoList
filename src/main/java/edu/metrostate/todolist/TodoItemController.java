package edu.metrostate.todolist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TodoItemController {
    @FXML
    private TextField todoItem;

    public void onAdd(ActionEvent actionEvent) throws IOException {

        ToDoListItem item = new ToDoListItem(todoItem.getText());

        ToDoApplication.list.add(item);

        FXMLLoader fxmlLoader = new FXMLLoader(ToDoApplication.class.getResource("todo-list.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        ((Stage)todoItem.getScene().getWindow()).setScene(scene);

    }

    public void onCancel(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ToDoApplication.class.getResource("todo-list.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        ((Stage)todoItem.getScene().getWindow()).setScene(scene);

        todoItem.setText("");
    }
}
