package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class GameListDTO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  public GameListDTO(GameList gameList) {
    BeanUtils.copyProperties(gameList, this);
  }



}
