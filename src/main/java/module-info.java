module org.example.projectt {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projectt to javafx.fxml;
    exports org.example.projectt;
}