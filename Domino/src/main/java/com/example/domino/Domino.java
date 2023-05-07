package com.example.domino;

public class Domino {
    private int valueLeft;
    private int valueRight;

    public Domino(int valueLeft, int valueRight) {
        this.valueLeft = valueLeft;
        this.valueRight = valueRight;
    }

    public int getValueLeft() {
        return valueLeft;
    }

    public int getValueRight() {
        return valueRight;
    }

    public void flip() {
        int temp = valueLeft;
        valueLeft = valueRight;
        valueRight = temp;
    }

    public boolean matches(Domino other) {
        return (valueLeft == other.valueLeft || valueRight == other.valueRight);
    }

    @Override
    public String toString() {
        return "[" + valueLeft + "|" + valueRight + "]";
    }
}

