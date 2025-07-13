package com.MarvinVanelsland.zombicide_backend.zombicide;

import java.util.ArrayList;
import java.util.List;

import com.MarvinVanelsland.zombicide_backend.zombicide.actors.Player;
import com.MarvinVanelsland.zombicide_backend.zombicide.actors.Zombie;
import com.MarvinVanelsland.zombicide_backend.zombicide.boards.TrainingBoard;
import com.MarvinVanelsland.zombicide_backend.zombicide.items.Flask;
import com.MarvinVanelsland.zombicide_backend.zombicide.items.MasterKey;
import com.MarvinVanelsland.zombicide_backend.zombicide.items.weapons.Axe;
import com.MarvinVanelsland.zombicide_backend.zombicide.players.Fighter;
import com.MarvinVanelsland.zombicide_backend.zombicide.players.Healer;
import com.MarvinVanelsland.zombicide_backend.zombicide.players.Lucky;
import com.MarvinVanelsland.zombicide_backend.zombicide.players.Nosy;
import com.MarvinVanelsland.zombicide_backend.zombicide.zombies.Abomination;
import com.MarvinVanelsland.zombicide_backend.zombicide.zombies.Runner;
import com.MarvinVanelsland.zombicide_backend.zombicide.zombies.Tank;
import com.MarvinVanelsland.zombicide_backend.zombicide.zombies.Walker;

public class Livrable3 {
	
	public static void main(String[] args) {
	// créer la ville d’entraînement,
	Board board = new TrainingBoard(); //creation du plateau d'entrainement
	Game game = new Game(board); //creation de la partie
	
	// placer un zombie (peu importe le type) sur chaque zone,
	for (int i = 0 ; i < 5 ; i++) { // parcour longueur du plateau
		for (int j = 0 ; j < 5 ; j++ ) {
			Zombie zombie = new Walker("" + i + j) ; // création du zombie i j 
			game.addZombie(zombie,i,j); // ajout du zombie i j 
		}
	}
	
	// créer un survivant de chaque rôle sur la zone au nord du carrefour principal,
	Player player1 = new Fighter("Rambo");
	Player player2 = new Healer("Support");
	Player player3 = new Lucky("Lechanceux");
	Player player4 = new Nosy("Lefêtar");
	
	
	
	Item hache = new Axe() ;
	Item fiole = new Flask() ; 
	
	// placer une hache dans la main du second survivant
	player2.addItemInventory(hache);
	player2.SetHand(hache);
	
	// placer une fiole dans la main du troisième survivant
	player3.addItemInventory(fiole);
	player3.SetHand(fiole);
	
	player1.MinusActionPoint(3);
	player2.MinusActionPoint(3);
	player3.MinusActionPoint(3);
	player4.MinusActionPoint(3);
	
	
	game.addPlayer(player1,1,2);
	game.addPlayer(player2,1,2);
	game.addPlayer(player3,1,2);
	game.addPlayer(player4,1,2);
	
	//afficher une représentation de la ville,
	game.displayBoard(); 
	
	// exécuter une action par survivant
	game.chooseAction(player1);
	game.chooseAction(player2);
	game.chooseAction(player3);
	game.chooseAction(player4);
	
	// exécuter l'action d’attaquer et de se déplacer pour l'ensemble des zombies (*)
	game.zombiePhase();
	
	// afficher une représentation de la ville
	game.displayBoard(); 
	
	// afficher l'état des survivants 
	game.displayPlayersStatus() ;
	
	
}}