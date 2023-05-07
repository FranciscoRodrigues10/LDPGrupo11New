package com.example.domino;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ControllerPane extends Pane {

    private BorderPane root;
    private Controller controller;
    private Board board;

    public ControllerPane(Controller controller) {
        this.controller = controller;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/domino/hello-view.fxml"));
        fxmlLoader.setRoot(root);
        fxmlLoader.setController(controller);
        try {
            root = fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        getChildren().add(root);
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
