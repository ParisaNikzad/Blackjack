package com.pn.blackjack.model;

import com.pn.blackjack.service.Hand;

public class Player {

    Hand hand;

    public Player(){
        hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }
}
