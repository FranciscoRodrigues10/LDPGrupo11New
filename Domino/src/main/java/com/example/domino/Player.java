package com.example.domino;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Tile> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Tile> getHand() {
        return hand;
    }

    public void drawTile(Tile tile) {
        hand.add(tile);
    }

    public boolean hasTile(Tile tile) {
        return hand.contains(tile);
    }

    public void removeTile(Tile tile) {
        hand.remove(tile);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("'s hand: ");
        for (Tile tile : hand) {
            sb.append(tile).append(" ");
        }
        return sb.toString();
    }
}

