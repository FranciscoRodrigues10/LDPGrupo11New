package com.example.domino;

public class Tile {
    private int left;
    private int right;

    public Tile(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public boolean isDouble() {
        return left == right;
    }

    public boolean matches(Tile tile) {
        return left == tile.left || left == tile.right || right == tile.left || right == tile.right;
    }

    public String toString() {
        return "[" + left + "|" + right + "]";
    }
}

