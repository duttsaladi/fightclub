/**
* GameOperations JUnit Test Cases
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.puzzle.game.GameOperations;
import com.puzzle.game.enums.GameTheme;
import com.puzzle.game.factory.GameOperationsFactory;
import com.puzzle.game.model.Fighter;
import com.puzzle.game.util.Constants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GameOperationsTests {

	GameOperations gameOperations = GameOperationsFactory.getInstance();

	@Test
	public void createFighter() {
		Fighter fighter = gameOperations.createFighter("testuser", 100, Constants.MYFIGHTER);

		assertEquals("testuser", fighter.getName());
	}

	@Test
	public void saveGame() {
		Fighter myFighter = new Fighter("testuser", 100, Constants.MYFIGHTER);
		Fighter opponentFighter = new Fighter("oppUser", 200, Constants.OPPONENTFIGHTER);

		try {
			gameOperations.saveGame(myFighter, opponentFighter, GameTheme.JUNGLEBOOK.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail("saveGame() failed");
		}
	}

	@Test
	public void getFighter() {
		Fighter fighter = gameOperations.getFighter(Constants.MYFIGHTER);

		assertEquals("testuser", fighter.getName());
	}

	@Test
	public void getGameTheme() {
		try {
			gameOperations.getGameTheme();
		} catch (Exception e) {
			e.printStackTrace();
			fail("getGameTheme() failed");
		}
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
