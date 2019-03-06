/**
* The Messages class contains the console messages
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.message;

import com.puzzle.game.model.Fighter;

public class Messages {

	public static void displayWelcomeMessage() {
		System.out.println(System.lineSeparator());
		System.out.println(System.lineSeparator());
		System.out.println("............................ Welcome to FIGHT CLUB ............................");
	}
	
	public static void displayGainedPowerMessage(Fighter fighter) {
		System.out.println(System.lineSeparator());
		System.out.println(
				"Hello " + fighter.getNameInUpperCase() + ".. You can play with gained power from the previous game.");
		System.out.println("Your new power is --> " + fighter.getPower());
	}

	public static void displayExploreClubMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Do you want to explore the club ?");
		System.out.println("Instruction: Enter Y or N");
	}

	public static void displayThemeListMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Please select any of these themes to proceed further");
		System.out.println("CODE  " + "THEME");
		System.out.println("----" + "  -------");
	}

	public static void displayRejectExploreThemeMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Try to explore the FIGHT CLUB themes...");
	}

	public static void displayExploreOptionMessage() {
		System.out.println("Do you want to see the theme options ?");
		System.out.println("Instruction: Enter Y or N");
	}

	public static void displayRejectExploreMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Try to pick your opponent and fight");
	}

	public static void displayOpponentOptionMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Enter code to choose your opponent");
		System.out.println("Instruction: Enter 1 or any code in the list");
	}

	public static void displayThemeOptionMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Enter code to choose your theme");
		System.out.println("Instruction: Enter 1 or any code in the list");
	}

	public static void displayThemeSelectionMessage(String themeName) {
		System.out.println("Great......!! you have chosen " + themeName + " theme");
		System.out.println(System.lineSeparator());
	}

	public static void displayOpponentSelectionMessage(String opponentName) {
		System.out.println("Great......!! you have chosen " + opponentName + "as your opponent");
		System.out.println(System.lineSeparator());
	}

	public static void displayFightersListMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("You can play with any of these fighters");
		System.out.println(System.lineSeparator());
		System.out.println("CODE  " + "FIGHTER" + "   POWER");
		System.out.println("----" + "  -------" + "   ------");
	}

	public static void displayFightInstructions() {
		System.out.println("Read the instructions carefully before heading for the fight");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. Tap the letter A and then Enter button on the keyboard to attack an opponent");
		System.out.println("2. Each tap decreases opponent power by 5 points and makes you gain 5 points");
		System.out.println("3. You can gain opponent power if you win");
		System.out.println("4. Tap the letter S to Save the game");
		System.out.println("5. Tap the letter Q to Quit the game");
		System.out.println(System.lineSeparator());
		System.out.println("Are you ready to start your fight ?");
		System.out.println("Instruction: Enter Y or N");
	}

	public static void displayFightStartMessage(Fighter myFighter, Fighter opponentFighter) {
		System.out.println(System.lineSeparator());
		System.out.println("Fight started::  " + myFighter.getNameInUpperCase() + " with Power " + myFighter.getPower()
				+ "   VS   " + opponentFighter.getNameInUpperCase() + " with Power " + opponentFighter.getPower());
		System.out.println(System.lineSeparator());
		System.out.println("Start your attack.....");
	}

	public static void displayFightRejectMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Try to pick your opponent and it will be fun !!");
	}

	public static void displayFightWinMessage(Fighter myFighter, Fighter opponentFighter) {
		System.out.println("Congratulations...!!! " + opponentFighter.getName() + " is defeated.");
		System.out.println("You have gained power of " + opponentFighter.getName() + ". Your new power is "
				+ myFighter.getPower());
	}

	public static void displayAttackMessage(Fighter myFighter, Fighter opponentFighter) {
		System.out.println(System.lineSeparator());
		System.out.println("*******ATTACKED**********");
		System.out.println(myFighter.getName() + " power --> " + myFighter.getPower());
		System.out.println(opponentFighter.getName() + " power --> " + opponentFighter.getPower());
	}

	public static void displayNewGameMessage() {
		System.out.println("............. NEW GAME ..........");
	}

	public static void displayGameEndMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("..........................GAME ENDED..............................");
		System.out.println(System.lineSeparator());
		System.out.println("Do you want to start new game ?");
		System.out.println("Instruction: Enter Y to start the new game or N to quit the game");
	}

	public static void displaySaveGameMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Game is saved. You want to continue ?");
		System.out.println("Instruction: Tap A and then Enter button to resume your attack or Q to quit the game");
	}

	public static void displayLoadGameOptionMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Do you want to load the saved game ?");
		System.out.println("Instruction: Enter Y to start the saved game or N to start the new game");
	}

	public static void displayLoadGameMessages(Fighter myFighter, Fighter opponent, String gameTheme) {
		System.out.println(System.lineSeparator());
		System.out.println("Loading the game..............");
		System.out.println("----------------------------------");
		System.out.println("Game theme is " + gameTheme);
		System.out.println("----------------------------------");
		System.out.println("Your name is " + myFighter.getNameInUpperCase());
		System.out.println("Your power is " + myFighter.getPower());
		System.out.println(System.lineSeparator());
		System.out.println("Your opponent name is " + opponent.getNameInUpperCase());
		System.out.println("Your opponent power is " + opponent.getPower());
		System.out.println(System.lineSeparator());
	}

	public static void displayQuitGameMessage() {
		System.out.println("Quitting the game...");
	}

	public static void displayUserNameInputMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Enter your name");
	}

	public static void displayWelcomeUserMessage(String name) {
		System.out.println("Welcome	" + name);
	}

	public static void displayUserPowerInputMessage() {
		System.out.println(System.lineSeparator());
		System.out.println("Enter your power");
		System.out.println("Ex: 100");
	}

	public static void displayUserPowerMessage(int power) {
		System.out.println("Your power is " + power);
	}

	public static void displayValidInputInputMessage() {
		System.out.println("Enter valid input");
	}
}
