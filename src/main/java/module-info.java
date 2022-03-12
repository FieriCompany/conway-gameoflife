module com.conwaygameoflife {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.conwaygameoflife to javafx.fxml;
    exports com.conwaygameoflife;
}