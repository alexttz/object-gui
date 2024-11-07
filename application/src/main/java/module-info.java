module org.example.objectgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.objectgui to javafx.fxml;
    exports org.example.objectgui;
    exports org.example.objectgui.Bandeiras;
    opens org.example.objectgui.Bandeiras to javafx.fxml;
}