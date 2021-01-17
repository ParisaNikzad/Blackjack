package com.pn.blackjack.service;

import com.pn.blackjack.model.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    List<Card> handCards;
    int total;
    int otherTotal;
    boolean aceFlag = false;
    StringBuffer sb = new StringBuffer("hand is: ");

    public Hand() {
        this.handCards = new ArrayList<>();
        this.total = 0;
        this.otherTotal = 0;
    }

    public void addCard(Card card){
        handCards.add(card);
        updateHand(card);
    }

    public void updateHand(Card card){
        sb.append(card.toString());
        sb.append(" ");
        total += card.getValue();
        if(card.isAceFlag()){
            aceFlag = true;
            otherTotal += total+10;
        }

    }

    public String printHand(){
        if(aceFlag){
            return sb + " " + "total: "+ total + " or " + otherTotal;
        }
        return sb + " " + total;
    }



    public int getTotal(){
        return total;
    }

    public int getOtherTotal(){
        return otherTotal;
    }

    public boolean isAceFlag() {
        return aceFlag;
    }
}
