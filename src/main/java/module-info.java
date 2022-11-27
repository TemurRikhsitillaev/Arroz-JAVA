module arroz.arroz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens arroz.arroz to javafx.fxml;
    exports arroz.arroz;
}