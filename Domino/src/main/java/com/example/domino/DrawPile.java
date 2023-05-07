package com.example.domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawPile {
    private List<Tile> tiles;

    public DrawPile() {
        tiles = new ArrayList<>();

        // Add all the possible tiles to the draw pile
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                tiles.add(new Tile(i, j));
            }
        }

        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(tiles);
    }

    public Tile drawTile() {
        if (tiles.size() == 0) {
            return null;
        }

        return tiles.remove(0);
    }

    public List<Tile> drawTiles(int count) {
        List<Tile> result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            Tile tile = drawTile();

            if (tile != null) {
                result.add(tile);
            }
        }

        return result;
    }
}

