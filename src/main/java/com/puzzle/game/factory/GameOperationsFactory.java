/**
* The GameOperationsFactory class creates singleton instance of GameOperations
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.factory;

import com.puzzle.game.GameOperations;
import com.puzzle.game.GameOperationsImpl;

public class GameOperationsFactory {

	private static GameOperations gameOperations = null;

	private GameOperationsFactory() {
	};

	public static GameOperations getInstance() {
		if (gameOperations == null)
			gameOperations = new GameOperationsImpl();

		return gameOperations;
	}
}