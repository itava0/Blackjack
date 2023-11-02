package com.pluralsight;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        deck.shuffle();
        // Ask for Player 1's name
        System.out.print("Enter Player 1's name: ");
        String player1Name = scanner.nextLine();

        // Ask for Player 2's name
        System.out.print("Enter Player 2's name: ");
        String player2Name = scanner.nextLine();

        Hand player1Hand = new Hand(player1Name);
        Hand player2Hand = new Hand(player2Name);

        // Deal 2 cards to each player
        for (int i = 0; i < 2; i++) {
            // Get a card from the deck for player 1
            Card card1 = deck.deal();
            player1Hand.Deal(card1);

            // Get a card from the deck for player 2
            Card card2 = deck.deal();
            player2Hand.Deal(card2);
        }

        int player1Value = player1Hand.getValue();
        int player2Value = player2Hand.getValue();

        System.out.println(player1Hand.getPlayerName() + "'s hand: " + player1Value);
        System.out.println(player2Hand.getPlayerName() + "'s hand: " + player2Value);

        // Determine the winner based on the values of the hands
        if (player1Value > 21 && player2Value > 21) {
            System.out.println("Both players bust. It's a tie!");
        } else if (player1Value > 21) {
            System.out.println("Player 1 busts. Player 2 wins!");
        } else if (player2Value > 21) {
            System.out.println("Player 2 busts. Player 1 wins!");
        } else if (player1Value > player2Value) {
            System.out.println("Player 1 wins!");
        } else if (player2Value > player1Value) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}


