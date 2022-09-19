module com.evotek.office.evo_office {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.evotek.office.evo_office to javafx.fxml;
    exports com.evotek.office.evo_office;
}