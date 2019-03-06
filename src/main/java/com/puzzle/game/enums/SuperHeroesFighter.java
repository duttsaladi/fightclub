/**
*  The SuperHeroesFighter enum contains list of SuperHeroes fighters
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.enums;

public enum SuperHeroesFighter {

	SUPERMAN(1, 40), BATMAN(2, 60), SPIDERMAN(3, 80);

	private int code;
	private int power;

	private SuperHeroesFighter(int code, int power) {
		this.code = code;
		this.power = power;
	};

	public int getPower() {
		return this.power;
	}

	public int getCode() {
		return code;
	}

	public static SuperHeroesFighter get(int code) {
		for (SuperHeroesFighter fighter : values()) {
			if (fighter.code == code) {
				return fighter;
			}
		}
		return null;
	}
}
