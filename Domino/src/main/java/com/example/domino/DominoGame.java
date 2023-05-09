package com.example.domino;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DominoGame extends Application {

    private Board board;
    private DrawPile drawPile;
    private Player[] players;
    private int currentPlayerIndex;

    //teste jdavidmacedo
    //oioi
    //commit 1
    //commit 2

    //commit1
    //commit2
    @Override
    public void start(Stage primaryStage) throws Exception {
        board = new Board();
        drawPile = new DrawPile();
        players = new Player[2];
        players[0] = new Player("Player 1");
        players[1] = new Player("Player 2");
        currentPlayerIndex = 0;

        board.setDrawPile(drawPile);
        board.setPlayers(players);
        board.setCurrentPlayerIndex(currentPlayerIndex);

        Controller controller = new Controller();
        controller.setBoard(board);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/domino/hello-view.fxml"));
        fxmlLoader.setController(new ControllerPane(controller));

        BorderPane root = fxmlLoader.load();

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Domino Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
