package com.MarvinVanelsland.zombicide_backend.zombicide.items;

import com.MarvinVanelsland.zombicide_backend.zombicide.Board;
import com.MarvinVanelsland.zombicide_backend.zombicide.Cell;
import com.MarvinVanelsland.zombicide_backend.zombicide.Item;
import com.MarvinVanelsland.zombicide_backend.zombicide.actors.Player;

public class InfradedScope extends Item {
	
	
	private Board board;
	/** 
	 * Create a InfradedScope
	 * */
	public InfradedScope(Board board){
		super();
		this.board=board;
	}
	
	/**
	 * @param target the target
	 * */
	public void use(Player target){
		Cell playerCell=target.getCell();
		board.displayInfradedScope(playerCell);
	}
	
	/**
	 * create the another Item of the same type
	 */
	public Item createHomologue() {
		return new InfradedScope(board);
	}
	
	/** 
	  *  get the name of the Item
	  * @return String the name of the Item 
	  * 
	  * */
	public String toString(){
		return "Lunettes infrarouges" ;
	}
	

}
