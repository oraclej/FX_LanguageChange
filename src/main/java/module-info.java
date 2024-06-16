module ir.oraclej.fxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ir.oraclej.fxdemo to javafx.fxml;
    exports ir.oraclej.fxdemo;
}