package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

  @Autowired
  GameService gameService;
  @GetMapping("/games")
  public ResponseEntity<List<GameDTO>> listGames() {
    List<GameDTO> games = this.gameService.gameList();
    return ResponseEntity.ok().body(games);
  }


}
