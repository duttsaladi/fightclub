/**
*  The JungleBookFighter enum contains list of JungleBook fighters
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.enums;

public enum JungleBookFighter {

	MOGLI(1, 50), BAGGERA(2, 70), BALLU(3, 100);

	private int code;
	private int power;

	private JungleBookFighter(int code, int power) {
		this.code = code;
		this.power = power;
	};

	public int getPower() {
		return this.power;
	}

	public int getCode() {
		return code;
	}

	public static JungleBookFighter get(int code) {
		for (JungleBookFighter fighter : values()) {
			if (fighter.code == code) {
				return fighter;
			}
		}

		return null;
	}
}
