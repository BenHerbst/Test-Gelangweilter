module de.medienproduktionen.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires tornadofx;


    opens de.medienproduktionen.test to javafx.fxml;

    exports de.medienproduktionen.test;
}