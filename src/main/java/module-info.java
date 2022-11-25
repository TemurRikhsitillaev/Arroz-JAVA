module main.arroz {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.arroz to javafx.fxml;
    exports main.arroz;
}