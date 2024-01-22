package com.example.comp1008w2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Card card1 = new Card("Heart", "king");
//
//        System.out.println(card1);
//        System.out.println(card1 + " Colour: " + card1.getColour());
//        System.out.println(card1 + " Value: " + card1.getValue());
//
//        Card card2 = new Card("Spade", "Ace");
//        System.out.println(card2);

        DeckOfCards deck = new DeckOfCards();

        //deck.dealTopCard();
        ArrayList<Card> player1Hand = new ArrayList<>();
        ArrayList<Card> player2Hand = new ArrayList<>();
        deck.shuffle();
        for (int i=1; i<=5; i++){
            player1Hand.add(deck.dealTopCard());
            player2Hand.add(deck.dealTopCard());
        }

        System.out.println("Player 1: " + player1Hand);
        System.out.println("Player 2: " + player2Hand);


    }
}
