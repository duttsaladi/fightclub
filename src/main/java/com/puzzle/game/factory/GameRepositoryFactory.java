/**
* The GameRepositoryFactory class creates singleton instance of GameRespository
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.factory;

import com.puzzle.game.repository.GameRespository;
import com.puzzle.game.repository.GameRespositoryImpl;

public class GameRepositoryFactory {

	private static GameRespository gameRepository = null;

	private GameRepositoryFactory() {
	};

	public static GameRespository getInstance() {
		if (gameRepository == null)
			gameRepository = new GameRespositoryImpl();

		return gameRepository;
	}
}