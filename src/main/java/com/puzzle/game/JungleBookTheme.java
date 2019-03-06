/**
* The JungleBookTheme class implements FightClubTheme which
* contains options to explore the JungleBook theme .
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game;

import com.puzzle.game.enums.GameControl;
import com.puzzle.game.enums.GameOption;
import com.puzzle.game.enums.GameTheme;
import com.puzzle.game.enums.JungleBookFighter;
import com.puzzle.game.factory.ConsoleUtilFactory;
import com.puzzle.game.factory.FightClubFactory;
import com.puzzle.game.factory.GameOperationsFactory;
import com.puzzle.game.message.Messages;
import com.puzzle.game.model.Fighter;
import com.puzzle.game.util.ConsoleUtil;
import com.puzzle.game.util.Constants;

public class JungleBookTheme implements FightClubTheme {

	Fighter myFighter;
	Fighter opponentFighter;

	private GameOperations gameOperations;
	private ConsoleUtil consoleUtil;

	public JungleBookTheme(Fighter fighter, Fighter opponent) {
		myFighter = fighter;
		opponentFighter = opponent;

		initialize();
	}

	/**
	 * This method invokes during this class initialization to fetch the
	 * dependencies.
	 */
	private void initialize() {
		gameOperations = GameOperationsFactory.getInstance();
		consoleUtil = ConsoleUtilFactory.getInstance();
	}

	/**
	 * This method provides the other options in the game.
	 */
	@Override
	public void continueGame() {
		exploreOptions();

		chooseOpponent();

		fight();
	}

	/**
	 * This method provides the explore options.
	 */
	@Override
	public void exploreOptions() {
		Messages.displayExploreOptionMessage();

		GameOption option = consoleUtil.getOption();
		switch (option) {
		case YES:
			Messages.displayFightersListMessage();

			for (JungleBookFighter fighter : JungleBookFighter.values())
				System.out.println(fighter.getCode() + "     " + fighter.name() + "       " + fighter.getPower());

			break;

		case NO:
			Messages.displayRejectExploreMessage();

			exploreOptions();
		}
	}

	/**
	 * This method used for opponent selection.
	 */
	@Override
	public void chooseOpponent() {
		Messages.displayOpponentOptionMessage();

		JungleBookFighter selectedOpponent = consoleUtil.getJungleBookFighter();

		Messages.displayOpponentSelectionMessage(selectedOpponent.name());

		opponentFighter = gameOperations.createFighter(selectedOpponent.name(), selectedOpponent.getPower(), Constants.OPPONENTFIGHTER);
	}

	/**
	 * This method used for fight.
	 */
	@Override
	public void fight() {

		Messages.displayFightInstructions();

		GameOption option = consoleUtil.getOption();
		switch (option) {
		case YES:

			Messages.displayFightStartMessage(myFighter, opponentFighter);

			attack();
			break;

		case NO:

			Messages.displayFightRejectMessage();
			fight();
		}
	}

	/**
	 * This method used to attack, save and quit the game.
	 */
	private void attack() {
		GameControl control = consoleUtil.getControl();

		switch (control) {
		case ATTACK:
			int myFighterPower = myFighter.increasePower();
			myFighter.setPower(myFighterPower);

			int opponentPower = opponentFighter.decreasePower();
			opponentFighter.setPower(opponentPower);

			Messages.displayAttackMessage(myFighter, opponentFighter);

			if (opponentFighter.isDefeated()) 
				displayGameEndMessage();

			attack();

			break;

		case SAVE:
			gameOperations.saveGame(myFighter, opponentFighter, GameTheme.JUNGLEBOOK.toString());
			Messages.displaySaveGameMessage();
			attack();
			break;

		case QUIT:
			gameOperations.quitGame();
			break;
		}
	}

	/**
	 * This method displays the game end message.
	 */
	private void displayGameEndMessage() {
		Messages.displayFightWinMessage(myFighter, opponentFighter);

		Messages.displayGameEndMessage();

		GameOption option = consoleUtil.getOption();
		
		switch (option) {
		case YES:
			FightClub common = FightClubFactory.getInstance();
			common.newGame();
			break;

		case NO:
			gameOperations.quitGame();
		}
	}

}
