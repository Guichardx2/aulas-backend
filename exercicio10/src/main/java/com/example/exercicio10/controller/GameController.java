package com.example.exercicio10.controller;

import com.example.exercicio10.dto.GameDto;
import com.example.exercicio10.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    // Create a game
    @PostMapping("/creategame")
    @ResponseBody
    public ArrayList<GameDto> createGame(@RequestBody GameDto gameDto) {
        return gameService.createGame(gameDto);
    }

    // Read a game by name
    @GetMapping("/{name}")
    public GameDto readGame(@PathVariable String name) {
        return gameService.readGame(name);
    }

    // Read all games
    @GetMapping("/allgames")
    public ArrayList<GameDto> readAllGames() {
        return gameService.readAllGames();
    }

    // Update a game
    @PutMapping("/updategame/{name}")
    @ResponseBody
    public GameDto updateGame(@RequestBody GameDto gameDto, @PathVariable String name) {
        return gameService.updateGame(name, gameDto);
    }

    // Delete a game by name
    @DeleteMapping("/deletegame/{name}")
    public GameDto deleteGame(@PathVariable String name) {
        return gameService.deleteGame(name);
    }
}