/**
* The Fighter class is a model class which persists fighter details.
*
* @author  Dutt Saladi
* @version 1.0
*/

package com.puzzle.game.model;

public class Fighter {
	String name;
	int power;
	String type;

	public Fighter(String name, int power, String type) {
		super();
		this.name = name;
		this.power = power;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNameInUpperCase() {
		return this.name.toUpperCase();
	}

	public int increasePower() {
		return this.power + 5;
	}

	public int decreasePower() {
		return this.power - 5;
	}

	public boolean isDefeated() {
		return this.power == 0 ? true : false;
	}
}
