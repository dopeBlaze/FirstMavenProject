module com.broja.firstmavenproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.broja.firstmavenproject to javafx.fxml;
    exports com.broja.firstmavenproject;
}