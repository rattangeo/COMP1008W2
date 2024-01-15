package com.example.comp1008w2;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("Heart", "king");

        System.out.println(card1);
        System.out.println(card1 + " Colour: " + card1.getColour());
        System.out.println(card1 + " Value: " + card1.getValue());

        Card card2 = new Card("Spade", "Ace");
        System.out.println(card2);
    }
}
