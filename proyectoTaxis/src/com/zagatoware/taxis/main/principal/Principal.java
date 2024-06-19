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

public class Principal extends Application {

     
    @override
    public void start(Stage primaryStage) {
        // Barra del menu principal
            MenuBar menuBar = new MenuBar();

            Menu menuArchivo = new Menu("Archivo");
            MenuItem menuItemAbrir = new MenuItem("Abrir");
            menuItemAbrir.setOnAction(e->{});
            MenuItem itemCerrar = new MenuItem("Cerrar");
            MenuItem itemImprimir = new MenuItem("imprimir");
            MenuItem menuItemSalir = new MenuItem("Salir");
            menuItemSalir.setOnAction(e->System.exit(0));
            menuArchivo.getItems().addAll(menuItemAbrir, 
                                        itemCerrar,
                                        itemImprimir, 
                                        menuItemSalir);
            menuBar.getMenus().add(menuArchivo);
            Menu menuEditar = new Menu ("Editar");
            MenuItem itemCopiar = new MenuItem("Copiar");
            MenuItem itemCortar = new MenuItem("Cortar"); 
            MenuItem itemPegar = new MenuItem("Pegar"); 
            MenuItem itemSeleccionar = new MenuItem("Seleccionar"); 
            menuEditar.getItems.addAll(itemCopiar,itemCortar,itemPegar,itemSeleccionar,itemSeleccionar);
            menuBar.getMenus.add(menuBar);
            Menu menuParqueVehicular = new Menu ("Parque Vehicular");
            MenuItem itemVehiculos = new MenuItem ("Catalogos Vehiculos");
            MenuItem itemVehiculosIngresos = new MenuItem ("Ingresos");
            MenuItem itemEgresos=new MenuItem ("Egresos");
            MenuItem itemReporte=new MenuItem ("Reporte");
            menuParqueVehicular.getItems.addAll(itemVehiculos,itemVehiculosIngresos,itemEgresos,itemReporte);
            menuBar.getMenus.add(menuParqueVehicular);

            Menu menuCatalogos = new Menu ("Catalogos");

            menuBar.getMenus.add(menuCatalogos);

            Menu menuAcerca = new Menu ("Ayuda");
             MenuItem itemAcerca = new MenuItem ("Acerca de ..");
            menuAcerca.getItems.addAll(itemAcerca);
            menuBar.getMenus.add(menuAcerca);

              BorderPane root = new BorderPane();
        root.setTop(menuBar);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}