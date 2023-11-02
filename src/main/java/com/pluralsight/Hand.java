package com.pluralsight;
import java.util.*;
public class Hand {
    private ArrayList<Card> cards;
    private String playerName;

    public Hand(String playerName) {
        this.playerName = playerName;
        cards = new ArrayList<>();
    }
    // A Card is dealt to the Hand and the Hand is responsible
// to store the card
    public void Deal(Card card){
        cards.add(card);
    }
    public String getPlayerName() {
        return this.playerName;
    }
    public int getSize(){
        return cards.size();
    }
    // The Hand uses the methods of each card to determine
// the value of each card - and adds up all values
    public int getValue(){
        int value = 0;
        for(Card card: cards){
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }
        return value;
    }
}

