package com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Embeddable
public class BelongingPK implements Serializable {

  @ManyToOne
  @JoinColumn(name = "game_id")
  private Game game;
  @ManyToOne
  @JoinColumn(name = "list_id")
  private GameList gameList;


}
