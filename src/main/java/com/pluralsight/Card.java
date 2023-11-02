package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
        if (isFaceUp) {
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        if (isFaceUp) {
            // Determine point value and return it
            // A = 11
            // K, Q, J = 10
            // All numeric cards are equal to their face value
            if ("A".equals(value)) {
                return 11;
            } else if ("K".equals(value) || "Q".equals(value) || "J".equals(value)) {
                return 10;
            } else if (value.matches("\\d+")) {
                return Integer.parseInt(value);
            } else {
                // Handle invalid values gracefully, you might want to throw an exception
                return 0;
            }
        } else {
            // You should return an integer or throw an exception here, not a string "#"
            return 0;
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}

