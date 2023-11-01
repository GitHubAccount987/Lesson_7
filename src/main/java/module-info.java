module com.example.lesson_7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.lesson_7 to javafx.fxml;
    exports com.example.lesson_7;
}