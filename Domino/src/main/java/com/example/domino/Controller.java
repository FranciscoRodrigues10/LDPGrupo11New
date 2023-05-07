package com.example.domino;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label welcomeText;

    private Board board;

    @FXML
    private ControllerPane controllerPane;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // The board object is created and set to the controllerPane object
        board = new Board();
        controllerPane = new ControllerPane(this);
        controllerPane.setBoard(board);
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
