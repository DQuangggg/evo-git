module com.evotek.office.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.evotek.office.demo to javafx.fxml;
    exports com.evotek.office.demo;
}