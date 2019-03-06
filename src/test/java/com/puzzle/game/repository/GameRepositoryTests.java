/**
* GameRepository JUnit Test Cases
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.Test;

import com.puzzle.game.factory.GameRepositoryFactory;
import com.puzzle.game.model.Fighter;
import com.puzzle.game.repository.GameRespository;
import com.puzzle.game.util.Constants;

public class GameRepositoryTests {

	GameRespository gameRepository = GameRepositoryFactory.getInstance();

	@Test
	public void saveFighter() {
		Fighter fighter = new Fighter("testuser", 100, Constants.MYFIGHTER);
		try {
			gameRepository.saveFighter(fighter);
		} catch (Exception e) {
			e.printStackTrace();
			fail("saveFighter() failed");
		}
	}

	@Test
	public void getFighter() {
		Fighter savedFighter = gameRepository.getFighter(Constants.MYFIGHTER);

		assertEquals("testuser", savedFighter.getName());
	}

	@Test
	public void saveGameTheme() {
		try {
			gameRepository.saveGameTheme("TestTheme");
		} catch (Exception e) {
			e.printStackTrace();
			fail("saveGameTheme() failed");
		}

	}

	@Test
	public void getGameTheme() {
		String theme = gameRepository.getGameTheme();

		assertEquals("TestTheme", theme);
	}

	@Test
	public void deleteSavedFile() {
		File file = new File(Constants.SAVEFILENAME);
		File savedGameFile = new File(file.getAbsolutePath());
		if (savedGameFile.exists()) {
			savedGameFile.delete();
		}
	}

}
