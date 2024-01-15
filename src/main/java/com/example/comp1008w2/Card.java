package com.example.comp1008w2;

import java.util.Arrays;
import java.util.List;

public class Card {

    private String suit,faceName;

    /**
     * This constructor takes two arguments, one for the suit & one for facName.
     * It will create a new object.
     * @param suit "Hearts","Diamonds","Spades","Clubs"
     * @param faceName "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"
     */
    public Card(String suit, String faceName) {
        setSuit(suit);
        setFaceName(faceName);
    }


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        //check for the final position of the String
        if (suit.charAt(suit.length()-1) !='s')
            suit = suit + "s";
        //validate that the suit is Hearts, Diamonds, Spades or Clubs
        List<String> validSuits = Arrays.asList("hearts","diamonds","spades","clubs");
        //test if the argument is in the list of valid suits
        if (validSuits.contains(suit))
            this.suit =suit;
        else
            throw new IllegalArgumentException(suit + "is not valid, choose from: " + validSuits);

        this.suit = suit;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        List<String> validFaceNames =
                Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
        faceName = faceName.toLowerCase();
        if (validFaceNames.contains(faceName))
            this.faceName =faceName;
        else
            throw new IllegalArgumentException(faceName + " is not valid, choose from: " + validFaceNames);
    }

    /**
     * This method returns the colour of the suit. Red for diamonds and hearts, black for clubs and spades
     * @return "red" or "black"
     */
    public String getColour(){
        if (suit.equals("diamonds") || suit.equals("hearts"))
                return "red";
        else
            return "black";
    }

    /**
     * index ->    0,     1,   2,   3    4,    5,     6,      7,    8,       9,      10,   11,     12
     * faceName->  2,    3    4     5    6     7      8       9     10    "jack" "queen" "king"  "ace"
     * value ->    2     3     4    5    6     7      8       9     10     11      12      13       14
     * @return
     */

    public int getValue(){
        List<String> faceNames =
                Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
        return faceNames.indexOf(faceName)+2;
    }

    /**
     * This method will return a reference to suit of the card.
     * @return
     */
    @Override
    public String toString(){
        return faceName + " of " + suit;
    }

}
