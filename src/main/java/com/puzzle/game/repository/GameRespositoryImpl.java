/**
* The GameRespositoryImpl is a class which interacts with datastore
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import com.puzzle.game.model.Fighter;
import com.puzzle.game.util.Constants;

public class GameRespositoryImpl implements GameRespository {

	Properties prop;

	public GameRespositoryImpl() {
		prop = new Properties();
		loadSaveGamePropertiesFile();
	}

	/**
	 * This method loads the game save properties file.
	 */
	private void loadSaveGamePropertiesFile() {
		try {
			File file = new File(Constants.SAVEFILENAME);
			boolean savedGame = file.exists();
			if (savedGame)
				prop.load(new FileInputStream(Constants.SAVEFILENAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method stores the fighter details.
	 */
	@Override
	public void saveFighter(Fighter fighter) {
		OutputStream output = null;

		try {

			output = new FileOutputStream(Constants.SAVEFILENAME);

			prop.setProperty(fighter.getType() + "Name", fighter.getName());
			prop.setProperty(fighter.getType() + "Power", String.valueOf(fighter.getPower()));
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}


	/**
	 * This method stores the game theme details.
	 */
	@Override
	public void saveGameTheme(String theme) {
		OutputStream output = null;

		try {
			output = new FileOutputStream(Constants.SAVEFILENAME);

			prop.setProperty("gameTheme", theme);
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * This method gets the fighter details from store.
	 */
	@Override
	public Fighter getFighter(String type) {
		String myFighterName = prop.getProperty(type + "Name");
		int myFighterPower = Integer.parseInt(prop.getProperty(type + "Power"));

		return new Fighter(myFighterName, myFighterPower, type);
	}

	/**
	 * This method gets the game theme from store.
	 */
	@Override
	public String getGameTheme() {
		return prop.getProperty("gameTheme");
	}
}
