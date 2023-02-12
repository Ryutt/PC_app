module com.yout.cal.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.yout.cal.calculator to javafx.fxml;
    exports com.yout.cal.calculator;
}