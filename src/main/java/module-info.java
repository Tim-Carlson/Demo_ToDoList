module edu.metrostate.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.metrostate.todolist to javafx.fxml;
    exports edu.metrostate.todolist;
}