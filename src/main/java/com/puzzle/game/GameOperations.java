/**
* The GameOperations interface contains 
* various actions that are common to all the game themes
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game;

import com.puzzle.game.model.Fighter;

public interface GameOperations {

	public String readFighterName();

	public int readPower();

	public Fighter createFighter(String name, int power, String type);

	public void saveGame(Fighter myFighter, Fighter opponentFighter, String theme);

	public Fighter getFighter(String type);

	public String getGameTheme();

	public void quitGame();
	
}
