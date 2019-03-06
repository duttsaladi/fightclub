/**
* The GameControl enum contains list of fight controls
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.enums;

public enum GameControl {

	ATTACK("A"), SAVE("S"), QUIT("Q");

	private String key;

	private GameControl(String key) {
		this.key = key;
	};

	public String getKey() {
		return key;
	}

	public static GameControl get(String key) {
		for (GameControl control : values()) {
			if ((control.key).equals(key.toUpperCase())) {
				return control;
			}
		}
		return null;
	}
}
