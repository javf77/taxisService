import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaAcercaDe {
    public void mostrar() {
        Stage newWindow = new Stage();
        newWindow.setTitle("Acerca de ...");

        Label label = new Label("Esta es la Ventana B");
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label);

        Scene scene = new Scene(layout, 200, 150);
        newWindow.setScene(scene);
        newWindow.show();
    }
}
