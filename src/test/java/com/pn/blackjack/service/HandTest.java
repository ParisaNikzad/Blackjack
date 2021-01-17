package com.pn.blackjack.service;

import com.pn.blackjack.model.Card;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HandTest {

    private static Hand hand;

    @BeforeAll
    public static void init(){
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