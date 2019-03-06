/**
* FightClubApplication is the starting point of the application 
* which starts the game
* 
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.puzzle.game.factory.FightClubFactory;

@SpringBootApplication
public class FightClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(FightClubApplication.class, args);

		FightClub fightClub = FightClubFactory.getInstance();
		fightClub.startGame();
	}
}
