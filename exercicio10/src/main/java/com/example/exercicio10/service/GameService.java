package com.example.exercicio10.service;

import com.example.exercicio10.dto.GameDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GameService {
    ArrayList<GameDto> games = new ArrayList<>();


    // Create a game
    public ArrayList<GameDto> createGame(GameDto gameDto) {
        GameDto game = new GameDto(gameDto.getName(), gameDto.getGenre(), gameDto.getAuthor(), gameDto.getPlatform(), gameDto.getYear());
        games.add(game);
        return games;
    }

    // Read a game by name
    public GameDto readGame(String name) {
        for (GameDto game : games) {
            if (game.getName().equalsIgnoreCase(name)) {
                return game;
            }
        }
        return null;
    }

    public ArrayList<GameDto> readAllGames() {
       return games;
    }



    // Update a game
    public GameDto updateGame(String name, GameDto gameDto) {
        for (GameDto game : games) {
            if (game.getName().equalsIgnoreCase(name)) {
                game.setName(gameDto.getName());
                game.setGenre(gameDto.getGenre());
                game.setAuthor(gameDto.getAuthor());
                game.setPlatform(gameDto.getPlatform());
                game.setYear(gameDto.getYear());
                return game;
            }
        }
        return null;
    }

    // Delete a game by name
    public GameDto deleteGame(String name) {
        for (GameDto game : games) {
            if (game.getName().equalsIgnoreCase(name)) {
                games.remove(game);
            }
        }
        return null;

    }
}