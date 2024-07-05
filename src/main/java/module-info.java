module com.example.objectprint {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.objectprint to javafx.fxml;
    exports com.example.objectprint;
}