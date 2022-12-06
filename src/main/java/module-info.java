module arroz.arroz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires java.sql;

    opens arroz.arroz to javafx.fxml;
    exports arroz.arroz;
}