module co.edu.uniquindio.gestordecontactos {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.gestordecontactos to javafx.fxml;
    exports co.edu.uniquindio.gestordecontactos;
}