/**
* The ConsoleUtil class used for console operations.
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.util;

import java.util.Scanner;

import com.puzzle.game.enums.GameControl;
import com.puzzle.game.enums.GameOption;
import com.puzzle.game.enums.GameTheme;
import com.puzzle.game.enums.JungleBookFighter;
import com.puzzle.game.enums.SuperHeroesFighter;
import com.puzzle.game.message.Messages;

public class ConsoleUtil {

	Scanner scanner;

	public String readTextInput() {
		scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		if (input == null || input.equals("")) {
			Messages.displayValidInputInputMessage();
			return readTextInput();
		}
		return input;
	}

	public int readIntegerInput() {
		int input = 0;
		try {
			input = Integer.parseInt(readTextInput());
		} catch (NumberFormatException e) {
			Messages.displayValidInputInputMessage();
			return readIntegerInput();
		}
		return input;
	}

	public void closeScanner() {
		scanner.close();
	}

	public boolean optionYes() {
		return readTextInput().equalsIgnoreCase("Y");
	}

	public boolean optionNo() {
		return readTextInput().equalsIgnoreCase("N");
	}

	public GameControl getControl() {
		String input = readTextInput();
		GameControl control = GameControl.get(input);

		if (control == null) {
			Messages.displayValidInputInputMessage();
			return getControl();
		}

		return control;
	}

	public GameOption getOption() {
		String input = readTextInput();
		GameOption option = GameOption.get(input);

		if (option == null) {
			Messages.displayValidInputInputMessage();
			return getOption();
		}

		return option;
	}

	public GameTheme getTheme() {
		int input = readIntegerInput();
		GameTheme theme = GameTheme.get(input);

		if (theme == null) {
			Messages.displayValidInputInputMessage();
			return getTheme();
		}

		return theme;
	}

	public JungleBookFighter getJungleBookFighter() {
		int input = readIntegerInput();
		JungleBookFighter fighter = JungleBookFighter.get(input);

		if (fighter == null) {
			Messages.displayValidInputInputMessage();
			return getJungleBookFighter();
		}

		return fighter;
	}

	public SuperHeroesFighter getSuperHeroFighter() {
		int input = readIntegerInput();
		SuperHeroesFighter fighter = SuperHeroesFighter.get(input);

		if (fighter == null) {
			Messages.displayValidInputInputMessage();
			return getSuperHeroFighter();
		}

		return fighter;
	}

}
