package com.pn.blackjack.service;

import com.pn.blackjack.model.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    List<Card> handCards;
    int total;
    boolean aceFlag = false;
    StringBuffer sb = new StringBuffer("hand is: ");

    public Hand() {
        this.handCards = new ArrayList<>();
        this.total = 0;
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
        }

    }

    public String printHand(){
        if(aceFlag){
            return sb + " " + "total: "+ total + " or " + getOtherTotal();
        }
        return sb + " " + total;
    }



    public int getTotal(){
        return total;
    }

    public int getOtherTotal(){
        if(aceFlag){
            return (total + 10);
        }else
            return total;
    }

    public boolean isAceFlag() {
        return aceFlag;
    }
}
