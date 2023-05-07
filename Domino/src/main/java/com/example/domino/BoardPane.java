package com.example.domino;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class BoardPane extends Pane {
    private ArrayList<Domino> playedTiles;

    public BoardPane() {
        playedTiles = new ArrayList<Domino>();
    }

    public void addTile(Domino tile, double x, double y) {
        playedTiles.add(tile);
        Group tileGroup = createTileGroup(tile);
        tileGroup.setLayoutX(x);
        tileGroup.setLayoutY(y);
        getChildren().add(tileGroup);
    }

    private Group createTileGroup(Domino tile) {
        Group group = new Group();
        Rectangle rect = new Rectangle(0, 0, 40, 80);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);
        Text leftText = new Text(Integer.toString(tile.getValueLeft()));
        Text rightText = new Text(Integer.toString(tile.getValueRight()));
        leftText.setX(5);
        leftText.setY(15);
        rightText.setX(35);
        rightText.setY(75);
        group.getChildren().addAll(rect, leftText, rightText);
        return group;
    }

    public ArrayList<Domino> getPlayedTiles() {
        return playedTiles;
    }
}

