package com.zagatoware.taxis.main.principal;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class VentanaConMenuJavaFX extends Application {

    @override
    public void start(Stage primaryStage) {
        // Barra del menu principal
            MenuBar menuBar = new MenuBar();

            Menu menuArchivo = new Menu("Archivo");
            MenuItem menuItemAbrir = new MenuItem("Abrir");
            menuItemAbrir.setOnAction(e->{});
            MenuItem MenuItem itemCerrar = new MenuItem("Cerrar");
            MenuItem menuItemSalir = new MenuItem("Salir");
            menuItemSalir.setOnAction(e->System.exit(0));
            menuArchivo.getItems().addAll(menuItemAbrir, itemCerrar, menuItemSalir);
            menuBar.getMenus().add(menuArchivo);

            
    }

}