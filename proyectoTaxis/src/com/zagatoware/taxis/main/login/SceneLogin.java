package com.zagatoware.taxis.main.login;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Principal {

    public void  mostrar()
    {

       BorderPane borderPane = new BorderPane();
    
       Stage ventanaLogin =  new Stage();
       Scene scena = new Scene(borderPane, 200, 150);  
       newWindow.setScene(scena);
       
       newWindow.show();
    }
}