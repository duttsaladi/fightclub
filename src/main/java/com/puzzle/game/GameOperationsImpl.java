/**
* The GameOperationsImpl class contains 
* various actions that are common to all the game themes
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game;

import com.puzzle.game.factory.ConsoleUtilFactory;
import com.puzzle.game.factory.GameRepositoryFactory;
import com.puzzle.game.message.Messages;
import com.puzzle.game.model.Fighter;
import com.puzzle.game.repository.GameRespository;
import com.puzzle.game.util.ConsoleUtil;

public class GameOperationsImpl implements GameOperations {

	private GameRespository gameRespository;
	private ConsoleUtil consoleUtil;

	public GameOperationsImpl() {
		initialize();
	}

	/**
	 * This method invokes during this class initialization to fetch the dependencies.
	 */
	private void initialize() {
		gameRespository = GameRepositoryFactory.getInstance();
		consoleUtil = ConsoleUtilFactory.getInstance();
	}
	
	/**
	 * This method returns the fighter name from console.
	 */
	@Override
	public String readFighterName()  {
		Messages.displayUserNameInputMessage();

		String name = consoleUtil.readTextInput();

		Messages.displayWelcomeUserMessage(name);

		return name;
	}

	/**
	 * This method returns the fighter power from console.
	 */
	@Override
	public int readPower()  {
		Messages.displayUserPowerInputMessage();

		int power = consoleUtil.readIntegerInput();

		Messages.displayUserPowerMessage(power);

		return power;
	}

	/**
	 * This method returns the created fighter instance.
	 */
	@Override
	public Fighter createFighter(String name, int power, String type) {
		return new Fighter(name, power, type);
	}

	/**
	 * This method saves the game details.
	 */
	@Override
	public void saveGame(Fighter myFighter, Fighter opponentFighter, String theme) {
		gameRespository.saveFighter(myFighter);
		gameRespository.saveFighter(opponentFighter);
		gameRespository.saveGameTheme(theme);
	}

	/**
	 * This method returns the saved fighter details.
	 */
	@Override
	public Fighter getFighter(String type) {
		return gameRespository.getFighter(type);
	}
	
	/**
	 * This method returns the saved game theme details.
	 */
	@Override
	public String getGameTheme() {
		return gameRespository.getGameTheme();
	}

	/**
	 * This method used to quit the game.
	 */
	@Override
	public void quitGame() {
		Messages.displayQuitGameMessage();
		consoleUtil.closeScanner();
		System.exit(0);
	}

}
