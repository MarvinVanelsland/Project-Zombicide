package com.MarvinVanelsland.zombicide_backend.zombicide.zombies;

import com.MarvinVanelsland.zombicide_backend.zombicide.actors.Zombie;

public class Abomination extends Zombie {
	/** 
	 * create a Abomination type Zombie
	 * @param name the name of the zombie 
	 * */
	public Abomination(String name) {
		super(name);
		this.damage = 3;
		this.heal = 6;
	}
	
	/**
	 * take the damage with the " armor " 
	 */
	public void takeDamage(int dmg){
		if (dmg >1){
			this.heal -= dmg;
		}
	}
}
