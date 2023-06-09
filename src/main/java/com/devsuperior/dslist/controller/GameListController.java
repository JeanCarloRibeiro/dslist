package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.service.GameListService;
import com.devsuperior.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  GameListService gameListService;
  @Autowired
  GameService gameService;
  @GetMapping
  public ResponseEntity<List<GameListDTO>> listGames() {
    List<GameListDTO> games = this.gameListService.findAll();
    return ResponseEntity.ok().body(games);
  }

  @GetMapping("/{id}")
  public ResponseEntity<GameListDTO> listGamesById(@PathVariable(value = "id") Long id) {
    GameListDTO result = this.gameListService.findById(id);
    return ResponseEntity.ok().body(result);
  }

  @GetMapping("/{listId}/games")
  public ResponseEntity<List<GameDTO>> findByList(@PathVariable Long listId) {
    List<GameDTO> games = this.gameService.findByList(listId);
    return ResponseEntity.ok().body(games);
  }


}
