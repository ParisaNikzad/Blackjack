package com.pn.blackjack.service;

import com.pn.blackjack.model.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayTest {

    private static Hand hand;
    Play play;


    @Test
    public void playerWithAceGetBlackjack() {
        Play play = new Play();
        Card playerCard1 = new Card("SPADES", 1);
        Card playerCard2 = new Card("HEARTS", 5);
        Card playerCard3 = new Card("DIAMONDS", 1);
        Card playerCard4 = new Card("DIAMONDS", 4);
        hand = new Hand();
        hand.addCard(playerCard1);
        hand.addCard(playerCard2);
        hand.addCard(playerCard3);
        hand.addCard(playerCard4);
        assertEquals("You are Blackjack!", play.checkResult(hand, new Hand()));
    }

    @Test
    public void playerGetBlackjack() {
        play = new Play();
        Card playerCard1 = new Card("SPADES", 7);
        Card playerCard2 = new Card("HEARTS", 5);
        Card playerCard3 = new Card("DIAMONDS", 9);
        hand = new Hand();
        hand.addCard(playerCard1);
        hand.addCard(playerCard2);
        hand.addCard(playerCard3);
        assertEquals("You are Blackjack!", play.checkResult(hand, new Hand()));
    }

    @Test
    public void playerGetBusted() {
        play = new Play();
        Card playerCard1 = new Card("SPADES", 1);
        Card playerCard2 = new Card("HEARTS", 5);
        Card playerCard3 = new Card("DIAMONDS", 1);
        Card playerCard4 = new Card("DIAMONDS", 12);
        Card playerCard5 = new Card("SPADES", 5);
        hand = new Hand();
        hand.addCard(playerCard1);
        hand.addCard(playerCard2);
        hand.addCard(playerCard3);
        hand.addCard(playerCard4);
        hand.addCard(playerCard5);
        assertEquals("You are busted.", play.checkResult(hand, new Hand()));

    }

}