package com.pn.blackjack.model;

import com.pn.blackjack.service.Hand;

public class Dealer {

    Hand hand;

    public Dealer(){
        hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }
}
