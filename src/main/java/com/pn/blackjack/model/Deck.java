package com.pn.blackjack.model;

import java.util.Random;

public class Deck {

    Card[] deck = new Card[52];
    Random random = new Random();

    public Deck(){
        int count = 0;
        for (int i = 1; i <= 13; i++) {
            deck[count++] = new Card("HEARTS", i);
        }
        for (int i = 1; i <= 13; i++) {
            deck[count++] = new Card("SPADES", i);
        }
        for (int i = 1; i <= 13; i++) {
            deck[count++] = new Card("CLUBS", i);
        }
        for (int i = 1; i <= 13; i++) {
            deck[count++] = new Card("DIAMONDS", i);
        }
    }

    public Card getCard(){
        return deck[random.nextInt(52)];
    }

}
