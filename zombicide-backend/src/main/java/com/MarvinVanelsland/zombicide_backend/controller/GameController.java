package com.MarvinVanelsland.zombicide_backend.controller;

import com.MarvinVanelsland.zombicide_backend.service.GameService;
import com.MarvinVanelsland.zombicide_backend.zombicide.actors.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return gameService.getPlayers();
    }

    @PostMapping("/start")
    public String startGame() throws IOException {
        gameService.initGame();
        return "Game started";
    }
}
