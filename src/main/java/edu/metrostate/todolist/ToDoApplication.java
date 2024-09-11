package edu.metrostate.todolist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoApplication extends Application {

    public static ToDoList list = new ToDoList();

    /**
     * Loads initial screen
     * @param stage The stage to load into
     * @throws IOException Thrown on invalid screens
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ToDoApplication.class.getResource("todo-list.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Todo List");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        list.add(new ToDoListItem("Rake Leaves"));
        list.add(new ToDoListItem("Fix Leaky Faucet"));

        launch();
    }
}