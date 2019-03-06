/**
* The FightClubFactory class creates singleton instance of FightClub
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.factory;

import com.puzzle.game.FightClub;
import com.puzzle.game.FightClubImpl;

public class FightClubFactory {

	private static FightClub fightClub = null;

	private FightClubFactory() {
	};

	public static FightClub getInstance() {
		if (fightClub == null)
			fightClub = new FightClubImpl();

		return fightClub;
	}
}