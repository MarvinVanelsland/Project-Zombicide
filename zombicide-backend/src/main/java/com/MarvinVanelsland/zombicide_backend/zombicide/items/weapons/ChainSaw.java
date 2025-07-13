package com.MarvinVanelsland.zombicide_backend.zombicide.items.weapons;

import com.MarvinVanelsland.zombicide_backend.zombicide.Item;
import com.MarvinVanelsland.zombicide_backend.zombicide.items.Weapon;

public class ChainSaw extends Weapon {

	public ChainSaw() {
		super();
		this.isNoisy = true;
		this.damage = 3;
		this.nbDice = 2;
		this.treshold = 5;
		this.range = 0;
		this.openDoor=true;
	}
	
	/**
	 * create the another Item of the same type
	 */
	public Item createHomologue() {
		return new ChainSaw();
	}
	
	/** 
	  *  get the name of the Item
	  * @return String the name of the Item 
	  * 
	  * */
	public String toString() {
		return "Tronçoneuse" ;
	}

}
