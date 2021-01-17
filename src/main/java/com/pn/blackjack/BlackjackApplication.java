package com.pn.blackjack;

import com.pn.blackjack.service.Play;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlackjackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlackjackApplication.class, args);
		System.out.println("Welcome to Blackjack!");
		System.out.println("");
		System.out.println("RULES: ");
		System.out.println("	-The goal is to have higher card than dealer.");
		System.out.println("	-The face cards have 10 value. The Ace card has the value of 1 or 11.");
		System.out.println("	-Player can Hit to get more card or Stay.");
		System.out.println("");
		System.out.println("Game is started: ");
		System.out.println("");

		while(true){
			Play play = new Play();
			System.out.println("*******************************************************");
			play.startGame();
		}


	}

}
