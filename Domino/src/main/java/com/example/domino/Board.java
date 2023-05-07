package com.example.domino;

import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class Board extends Pane {
    private List<Tile> tiles;
    private DrawPile drawPile;
    private Player[] players;
    private int currentPlayerIndex;

    public Board() {
        this.tiles = new ArrayList<>();
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public boolean canPlaceTile(Tile tile) {
        if (tiles.isEmpty()) {
            return true;
        } else {
            return tiles.get(0).matches(tile) || tiles.get(tiles.size() - 1).matches(tile);
        }
    }

    public void placeTile(Tile tile) {
        if (tiles.isEmpty()) {
            tiles.add(tile);
        } else if (tiles.get(0).matches(tile)) {
            tiles.add(0, tile);
        } else if (tiles.get(tiles.size() - 1).matches(tile)) {
            tiles.add(tile);
        } else {
            throw new IllegalArgumentException("Cannot place tile: " + tile);
        }
    }

    public String toString() {
        if (tiles.isEmpty()) {
            return "Board: []";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Board: ");
            for (Tile tile : tiles) {
                sb.append(tile).append(" ");
            }
            return sb.toString();
        }
    }

    public void setDrawPile(DrawPile drawPile) {
        this.drawPile = drawPile;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }


}

