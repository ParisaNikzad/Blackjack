package com.pn.blackjack;

import com.pn.blackjack.model.*;
import com.pn.blackjack.model.Deck;
import com.pn.blackjack.service.Hand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BlackjackApplication {

	public static void main(String[] args) {

		SpringApplication.run(BlackjackApplication.class, args);
		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();
		String command;
		char character;

		System.out.println("Welcome to Blackjack!");
		System.out.println("");
		System.out.println("RULES: ");
		System.out.println("	-The goal is to have higher card than dealer.");
		System.out.println("	-The face cards have 10 value. The Ace card has the value of 1 or 11.");
		System.out.println("	-Player can Hit to get more card or Stay.");
		System.out.println("");
		Player player = new Player();
		Dealer dealer = new Dealer();
		System.out.println("Game is started: ");

		Hand playerHand = player.getHand();
		Hand dealerHand = dealer.getHand();

		playerHand.addCard(deck.getCard());
		playerHand.addCard(deck.getCard());

		dealerHand.addCard(deck.getCard());

		System.out.println("you " + playerHand.printHand());
		System.out.println("Dealer " + dealerHand.printHand());
		if(playerHand.getTotal()==21||playerHand.getOtherTotal()==21)
			System.out.println("You are blackjack!");
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

			if(playerHand.getTotal()==21||playerHand.getOtherTotal()==21)
				System.out.println("you are Blackjack!");
			else if(playerHand.getTotal()>21)
				System.out.println("you are busted");
			else{
				do{
					dealerHand.addCard(deck.getCard());
					dealerHand.printHand();
				}while(dealerHand.getTotal()<17);

				System.out.println("Dealer " + dealerHand.printHand());
				if(dealerHand.getTotal()==21)
					System.out.println("Dealer is Blackjack!");
				else if(dealerHand.getTotal()>21)
					System.out.println("You won!");
				else if(playerHand.getTotal()>dealerHand.getTotal())
					System.out.println("you won!");
				else if(playerHand.getTotal()==dealerHand.getTotal())
					System.out.println("It is push");
				else
					System.out.println("Dealer won.");
			}

		}


	}

}
