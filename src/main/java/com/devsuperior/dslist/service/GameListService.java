package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repository.GameListRepository;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameListService {

  @Autowired
  GameListRepository gameListRepository;

  public List<GameListDTO> findAll() {

    List<GameList> gameList = this.gameListRepository.findAll();

    return gameList.stream().map(GameListDTO::new).collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public GameListDTO findById(Long id) {
    GameList gameList = this.gameListRepository.findById(id).get();
    return new GameListDTO(gameList);
  }


}
