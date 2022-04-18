module com.taller.taller_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.apache.commons.lang3;


    opens com.taller.taller_java to javafx.fxml;
    exports com.taller.taller_java;
}