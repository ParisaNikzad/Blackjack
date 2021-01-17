package com.pn.blackjack.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    public void testGetValueForAnyCard(){
        Card card = new Card("CLUBS", 2);
        assertEquals(2, card.getValue());
    }

    @Test
    public void testGetValueForJack(){
        Card card = new Card("CLUBS", 11);
        assertEquals(10, card.getValue());
    }

    @Test
    public void testGetValueForQueen(){
        Card card = new Card("HEARTS", 12);
        assertEquals(10, card.getValue());
    }

    @Test
    public void testGetValueForKing(){
        Card card = new Card("CLUBS", 13);
        assertEquals(10, card.getValue());
    }

    @Test
    public void testGetValueForAce(){
        Card card = new Card("DIAMONDS", 1);
        assertEquals(1, card.getValue());
    }

}