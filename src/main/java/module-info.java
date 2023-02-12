module com.yout.cal.caculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.yout.cal.caculator to javafx.fxml;
    exports com.yout.cal.caculator;
}