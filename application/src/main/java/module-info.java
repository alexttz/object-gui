module org.example.objectgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.objectgui to javafx.fxml;
    exports org.example.objectgui;
}