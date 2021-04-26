module cr.ac.una.tarea {
    requires javafx.controls;
    requires javafx.fxml;
    opens cr.ac.una.tarea.Controller;
    exports cr.ac.una.tarea.Controller;
    exports cr.ac.una.tarea.util;
    
    opens cr.ac.una.tarea to javafx.fxml;
    exports cr.ac.una.tarea;
    requires com.jfoenix;
    requires java.logging;
    
}
