package com.pn.blackjack.service;

import com.pn.blackjack.model.Dealer;
import com.pn.blackjack.model.Deck;
import com.pn.blackjack.model.Player;

import java.util.Scanner;

public class Play {
    Scanner sc = new Scanner(System.in);
    Deck deck = new Deck();
    String command;
    char character;

    public void startGame(){
        Player player = new Player();
        Dealer dealer = new Dealer();
        System.out.println("New Round: ");

        Hand playerHand = player.getHand();
        Hand dealerHand = dealer.getHand();

        playerHand.addCard(deck.getCard());
        playerHand.addCard(deck.getCard());

        dealerHand.addCard(deck.getCard());

        System.out.println("you " + playerHand.printHand());
        System.out.println("Dealer " + dealerHand.printHand());
        if(playerHand.getTotal()==21||playerHand.getOtherTotal()==21)
            System.out.println(checkResult(playerHand, dealerHand));
        else{
            do{
                do {
                    System.out.println("Hit(H) or Stand(S)?");
                    command = sc.next();
                    character = command.toUpperCase().charAt(0);
                } while ( ! ( character == 'H' || character == 'S' ) );
                if(character == 'H'){
                    playerHand.addCard(deck.getCard());
                    System.out.println("you " + playerHand.printHand());
                }
            }while(character!='S' && playerHand.getTotal()<21);

            System.out.println(checkResult(playerHand, dealerHand));

        }

    }

    public String checkResult(Hand playerHand, Hand dealerHand){
        if(playerHand.getTotal()==21||playerHand.getOtherTotal()==21)
            return "You are Blackjack!";
        else if(playerHand.getTotal()>21)
            return "You are busted.";
        else{
            do{
                dealerHand.addCard(deck.getCard());
                dealerHand.printHand();
            }while(dealerHand.getTotal()<17);

            System.out.println("Dealer " + dealerHand.printHand());
            if(dealerHand.getTotal()==21)
                return "Dealer is Blackjack!";
            else if(dealerHand.getTotal()>21)
                return "You won!";
            else if(playerHand.getTotal()>dealerHand.getTotal())
                return "You won!";
            else if(playerHand.getTotal()==dealerHand.getTotal())
                return "It is push";
            else
                return "Dealer won.";
        }
    }

}
