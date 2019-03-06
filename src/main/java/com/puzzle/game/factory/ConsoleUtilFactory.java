/**
* The ConsoleUtilFactory class creates singleton instance of ConsoleUtil
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.factory;

import com.puzzle.game.util.ConsoleUtil;

public class ConsoleUtilFactory {

	private static ConsoleUtil consoleUtil = null;

	private ConsoleUtilFactory() {
	};

	public static ConsoleUtil getInstance() {
		if (consoleUtil == null)
			consoleUtil = new ConsoleUtil();

		return consoleUtil;
	}
}