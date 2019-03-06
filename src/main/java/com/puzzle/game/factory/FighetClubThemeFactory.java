/**
* The FighetClubThemeFactory class creates singleton instance of FightClubTheme
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.factory;

import com.puzzle.game.FightClubTheme;
import com.puzzle.game.JungleBookTheme;
import com.puzzle.game.SuperHeroesTheme;
import com.puzzle.game.model.Fighter;

public class FighetClubThemeFactory {

	public static FightClubTheme getInstance(String theme, Fighter fighter, Fighter opponentFighter) {

		FightClubTheme fightClubTheme = null;

		switch (theme) {
		case "SUPERHERO":
			fightClubTheme = new SuperHeroesTheme(fighter, opponentFighter);
			break;

		case "JUNGLEBOOK":
			fightClubTheme = new JungleBookTheme(fighter, opponentFighter);
			break;
		}

		return fightClubTheme;
	}

}
