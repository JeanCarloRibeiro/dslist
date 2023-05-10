package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity @Table(name = "tb_belonging")
public class Belonging {

  @EmbeddedId
  BelongingPK id = new BelongingPK();
  private Integer position;

  public Belonging(Game game, GameList gameList, Integer position) {
    this.id.setGame(game);
    this.id.setGameList(gameList);
    this.position = position;
  }
}
