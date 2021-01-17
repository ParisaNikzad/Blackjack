package com.pn.blackjack.service;

import com.pn.blackjack.model.Card;
import com.pn.blackjack.service.Hand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HandTest {

    private static Hand hand;
    List<Card> handCards;

    @BeforeAll
    public static void addCard(){
        Card card = new Card("SPADES", 1);
        hand = new Hand();
        hand.addCard(card);
    }

    @Test
    public void testGetTotal(){
        assertEquals(1, hand.getTotal());
    }

    @Test
    public void testGetOtherTotal(){
        assertEquals(11, hand.getOtherTotal());
    }

    @Test
    public void testAceFlag(){
        assertEquals(true, hand.isAceFlag());
    }

    @Test
    public void testPrintHand(){
        assertEquals("hand is: ACE SPADES  total: 1 or 11", hand.printHand());
    }


}