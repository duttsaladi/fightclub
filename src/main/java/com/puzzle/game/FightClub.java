/**
* FightClub Interface creates the new game or load the existing game
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game;

import com.puzzle.game.message.Messages;

public interface FightClub {

	default void welcomeMessage() {
		Messages.displayWelcomeMessage();
	}

	void startGame();

	void newGame();
}
