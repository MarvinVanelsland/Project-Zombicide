package com.MarvinVanelsland.zombicide_backend.service;

import com.MarvinVanelsland.zombicide_backend.zombicide.Board;
import com.MarvinVanelsland.zombicide_backend.zombicide.Game;
import com.MarvinVanelsland.zombicide_backend.zombicide.actors.Player;
import com.MarvinVanelsland.zombicide_backend.zombicide.boards.TrainingBoard;
import com.MarvinVanelsland.zombicide_backend.zombicide.players.Fighter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    private Board board;
    private List<Player> players;

    public void initGame() throws IOException {
        board = new TrainingBoard();
        Game game=new Game(board);
        players = new ArrayList<>();
        // Ajoute des joueurs de test
        players.add(new Fighter("Alice"));
        players.add(new Fighter("Bob"));

        game.addPlayer(players.get(1),2,2 );

        game.play();
    }

    public List<Player> getPlayers() {
        return players;
    }

}
