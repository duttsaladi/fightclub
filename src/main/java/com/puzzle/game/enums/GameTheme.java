/**
*  The GameTheme enum contains list of 
*  themes used in the game
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.enums;

public enum GameTheme {

	SUPERHERO(1, "Super Hero Fight Club"), JUNGLEBOOK(2, "Jungle Book Fight Club");

	private int code;
	private String name;

	private GameTheme(int code, String name) {
		this.code = code;
		this.name = name;
	};

	public int getCode() {
		return code;
	}

	public String getName() {
		return this.name;
	}

	public static GameTheme get(int code) {
		for (GameTheme theme : values()) {
			if (theme.code == code) {
				return theme;
			}
		}
		return null;
	}
}
