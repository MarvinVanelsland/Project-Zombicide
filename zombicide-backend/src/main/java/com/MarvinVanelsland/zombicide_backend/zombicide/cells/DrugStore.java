package com.MarvinVanelsland.zombicide_backend.zombicide.cells;

import com.MarvinVanelsland.zombicide_backend.zombicide.Board;
import com.MarvinVanelsland.zombicide_backend.zombicide.Cell;
import com.MarvinVanelsland.zombicide_backend.zombicide.actors.Player;
import com.MarvinVanelsland.zombicide_backend.zombicide.items.Flask;

/**
 * Represents a drug store cell on the Zombicide game board.
 */
public class DrugStore extends Cell {
	
	/**
     * Constructs a drug store cell.
     */
	public DrugStore(Board board) {
		super(board);
		this.hasFloor = true ;

	}
	
	public void addPlayer(Player player) {
		super.addPlayer(player); 
		Flask flask = new Flask() ;
		this.addItem(flask);
		
	}

	/**
     * Returns the character representation of a drug store cell.
     *
     * @return The character 'D' representing a drug store cell.
     */
	public char toCharacter() {
		return 'D';
	}

}
