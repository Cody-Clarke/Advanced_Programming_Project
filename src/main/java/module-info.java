module org.example.advanced_programming_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.advanced_programming_project to javafx.fxml;
    exports org.example.advanced_programming_project;
}