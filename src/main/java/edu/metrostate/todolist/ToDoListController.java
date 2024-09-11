package edu.metrostate.todolist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ToDoListController implements Initializable {
    @FXML
    private ListView<IDisplayItem> todoList;

    @FXML
    private TextField filter;


    @FXML
    protected void addNewItem(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ToDoApplication.class.getResource("todo-item.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        ((Stage)todoList.getScene().getWindow()).setScene(scene);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<IDisplayItem> observeList = FXCollections.observableList(ToDoApplication.list);
        todoList.setItems(observeList);
    }

    public void applyFilter(ActionEvent actionEvent) {
        ObservableList<IDisplayItem> observeList = FXCollections.observableList(ToDoApplication.list.stream().filter(item -> item.getItemName().contains(filter.getText())).toList());
        todoList.setItems(observeList);
    }
}