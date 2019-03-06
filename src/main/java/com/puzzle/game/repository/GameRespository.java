/**
* The GameRespository Interface is a facade layer to interact with data store
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.repository;

import com.puzzle.game.model.Fighter;

public interface GameRespository {

	public void saveFighter(Fighter fighter);

	public void saveGameTheme(String theme);

	public Fighter getFighter(String type);

	public String getGameTheme();
}
