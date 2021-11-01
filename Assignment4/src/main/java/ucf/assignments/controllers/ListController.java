/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Diego Santiago
 */

package ucf.assignments.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ListController {

    @FXML
    private TextField ListNameField;

    @FXML
    private Button createListButton;

    @FXML
    private Button deleteListButton;

    @FXML
    private Button editListButton;

    @FXML
    private TableView<?> listTable;

    @FXML
    private Button saveListButton;

    @FXML
    void initialize() {

        editListButton.setOnAction(event -> {

            editListButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/com/example/assignment4/itempage.fxml"));
            try{
                loader.load();
            }catch (IOException e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });


        // Handle the button and text functions of the list page, I/O
    }

}
