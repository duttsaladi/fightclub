/**
* The GameOption enum contains list of options
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.enums;

public enum GameOption {

	YES("Y"), NO("N");

	private String key;

	private GameOption(String key) {
		this.key = key;
	};

	public String getKey() {
		return key;
	}

	public static GameOption get(String key) {
		for (GameOption option : values()) {
			if ((option.key).equals(key.toUpperCase())) {
				return option;
			}
		}
		return null;
	}
}
