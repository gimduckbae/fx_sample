module com.example.fx_sample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.fx_sample to javafx.fxml;
    exports com.example.fx_sample;
    exports com.example.fx_sample.controller;
    opens com.example.fx_sample.controller to javafx.fxml;
}