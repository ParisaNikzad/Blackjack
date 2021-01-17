package com.pn.blackjack.model;

public class Card {

    private String suit;
    private int number;
    private int value;
    private boolean aceFlag;

    public Card(String suit, int number) {
        this.suit = suit;
        this.number = number;
        if(number == 1)
            this.aceFlag = true;
        else
            this.aceFlag = false;
        if(10<number && number<14)
            value = 10;
        else
            value = number;
    }

    public int getValue(){
        return value;
    }

    public boolean isAceFlag() {
        return aceFlag;
    }

    public String getValueName(){
        String name = "";
        switch(this.number){
            case 1:
                name = "ACE";
                break;
            case 2:
                name = "TWO";
                break;
            case 3:
                name = "THREE";
                break;
            case 4:
                name = "FOUR";
                break;
            case 5:
                name = "FIVE";
                break;
            case 6:
                name = "SIX";
                break;
            case 7:
                name = "SEVEN";
                break;
            case 8:
                name = "EIGHT";
                break;
            case 9:
                name = "NINE";
                break;
            case 10:
                name = "TEN";
                break;
            case 11:
                name = "JACK";
                break;
            case 12:
                name = "QUEEN";
                break;
            case 13:
                name = "KING";
                break;
        }
        return name;
    }

    @Override
    public String toString() {
        return getValueName() + " " + suit;

    }
}