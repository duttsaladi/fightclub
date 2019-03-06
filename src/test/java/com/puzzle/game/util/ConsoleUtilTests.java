/**
* ConsoleUtil JUnit Test Cases
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.util;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.puzzle.game.enums.GameControl;
import com.puzzle.game.enums.GameOption;
import com.puzzle.game.enums.GameTheme;
import com.puzzle.game.enums.JungleBookFighter;
import com.puzzle.game.enums.SuperHeroesFighter;
import com.puzzle.game.factory.ConsoleUtilFactory;
import com.puzzle.game.util.ConsoleUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsoleUtilTests {
	
	ConsoleUtil consoleUtil = ConsoleUtilFactory.getInstance();

	@Test
	public void readTextInput() {
		String input = "Y";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		assertEquals("Y", consoleUtil.readTextInput());
	}
	
	@Test
	public void readIntegerInput() {
		String input = "1";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		assertEquals(1, consoleUtil.readIntegerInput());
	}
	
	@Test
	public void getControl() {
		String input = "a";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		assertEquals(GameControl.ATTACK, consoleUtil.getControl());
	}
	
	@Test
	public void getOption() {
		String input = "y";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		assertEquals(GameOption.YES, consoleUtil.getOption());
	}
	
	@Test
	public void getTheme() {
		String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		assertEquals(GameTheme.JUNGLEBOOK, consoleUtil.getTheme());
	}
	
	@Test
	public void getJungleBookFighter() {
		String input = "1";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		assertEquals(JungleBookFighter.MOGLI, consoleUtil.getJungleBookFighter());
	}
	
	@Test
	public void getSuperHeroFighter() {
		String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		assertEquals(SuperHeroesFighter.BATMAN, consoleUtil.getSuperHeroFighter());
	}

}
