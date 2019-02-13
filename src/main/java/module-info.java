
module socketserverfx {
    requires com.jtconnors.socket;
    requires java.base;
    requires java.logging;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    exports com.jtconnors.socketserverfx;
    opens com.jtconnors.socketserverfx to javafx.fxml;
}
