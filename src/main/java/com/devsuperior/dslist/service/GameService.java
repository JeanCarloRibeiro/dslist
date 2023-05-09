package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

  @Autowired
  GameRepository gameRepository;

  public List<GameDTO> gameList() {

    List<Game> games = this.gameRepository.findAll();

    return games.stream().map(GameDTO::new).collect(Collectors.toList());
  }


}
