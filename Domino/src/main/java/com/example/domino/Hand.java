package com.example.domino;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Domino> tiles;

    public Hand() {
        tiles = new ArrayList<Domino>();
    }

    public void addTile(Domino tile) {
        tiles.add(tile);
    }

    public boolean hasTile(Domino tile) {
        return tiles.contains(tile);
    }

    public void removeTile(Domino tile) {
        tiles.remove(tile);
    }

    public ArrayList<Domino> getTiles() {
        return tiles;
    }

    public int getSize() {
        return tiles.size();
    }
}

