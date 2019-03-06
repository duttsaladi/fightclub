/**
* The FightClubImpl class creates the new game or load the existing game
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game;

import java.io.File;

import com.puzzle.game.enums.GameOption;
import com.puzzle.game.enums.GameTheme;
import com.puzzle.game.factory.ConsoleUtilFactory;
import com.puzzle.game.factory.FighetClubThemeFactory;
import com.puzzle.game.factory.GameOperationsFactory;
import com.puzzle.game.message.Messages;
import com.puzzle.game.model.Fighter;
import com.puzzle.game.util.ConsoleUtil;
import com.puzzle.game.util.Constants;

public class FightClubImpl implements FightClub {

	Fighter myFighter;
	Fighter opponentFighter;

	private GameOperations gameOperations;
	private ConsoleUtil consoleUtil;

	public FightClubImpl() {
		initialize();
	}

	private void initialize() {
		gameOperations = GameOperationsFactory.getInstance();
		consoleUtil = ConsoleUtilFactory.getInstance();
	}

	/**
	 * This method starts the new game or loads the existing game.
	 */
	@Override
	public void startGame() {
		if (isNewGame())
			newGame();
		else
			loadGame();
	}

	/**
	 * This method creates the new game.
	 */
	@Override
	public void newGame() {
		welcomeMessage();

		boolean fighterExists = myFighter != null;
		if (!fighterExists)
			createFighter();
		else
			displayFighterInfo();

		exploreClub();

		chooseTheme();
	}

	/**
	 * This method displays the fighter previously gained power.
	 */
	private void displayFighterInfo() {
		Messages.displayGainedPowerMessage(myFighter);
	}

	/**
	 * This method tells if the game is new or existing.
	 */
	private boolean isNewGame() {
		File file = new File(Constants.SAVEFILENAME);
		boolean newGame = !(file.exists());
		if (newGame)
			return true;

		Messages.displayLoadGameOptionMessage();

		return consoleUtil.optionNo();
	}
	
	/**
	 * This method loads the existing game.
	 */
	private void loadGame() {

		myFighter = gameOperations.getFighter(Constants.MYFIGHTER);
		opponentFighter = gameOperations.getFighter(Constants.OPPONENTFIGHTER);
		String theme = gameOperations.getGameTheme();

		Messages.displayLoadGameMessages(myFighter, opponentFighter, theme);

		FightClubTheme fightClub = FighetClubThemeFactory.getInstance(theme, myFighter, opponentFighter);
		fightClub.fight();

	}

	/**
	 * This method creates the fighter instance.
	 */
	private void createFighter() {

		String fighterName = gameOperations.readFighterName();

		int fighterPower = gameOperations.readPower();

		myFighter = gameOperations.createFighter(fighterName, fighterPower, Constants.MYFIGHTER);
	}

	/**
	 * This method used to explore the fight club.
	 */
	private void exploreClub() {

		Messages.displayExploreClubMessage();

		GameOption option = consoleUtil.getOption();
		switch (option) {
		case YES:

			Messages.displayThemeListMessage();

			for (GameTheme theme : GameTheme.values())
				System.out.println(theme.getCode() + "     " + theme.name());

			break;

		case NO:

			Messages.displayRejectExploreThemeMessage();

			exploreClub();
		}
	}

	/**
	 * This method used to choose the fight club theme.
	 */
	private void chooseTheme() {
		Messages.displayThemeOptionMessage();

		GameTheme theme = consoleUtil.getTheme();

		Messages.displayThemeSelectionMessage(theme.name());

		FightClubTheme fightClub = FighetClubThemeFactory.getInstance(theme.name(), myFighter, opponentFighter);
		fightClub.continueGame();
	}
}
