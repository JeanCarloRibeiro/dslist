package com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity @Table(name = "tb_game")
@SqlResultSetMapping(
  name = "GameDTOQueryMapping",
  classes = {
    @ConstructorResult(
      targetClass = Game.class,
      columns = {
              @ColumnResult(name = "id", type = Long.class),
              @ColumnResult(name = "title", type = String.class),
              @ColumnResult(name = "year", type = Integer.class),
              @ColumnResult(name = "imgUrl", type = String.class),
              @ColumnResult(name = "shortDescription", type = String.class)
      }
    )
  }
)
public class Game {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  @Column(name = "game_year")
  private Integer year;
  private String genre;
  private String platforms;
  private Double score;
  private String imgUrl;
  @Column(columnDefinition = "TEXT")
  private String shortDescription;
  @Column(columnDefinition = "TEXT")
  private String longDescription;

  public Game(Long id, String title, Integer year, String imgUrl, String shortDescription) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.imgUrl = imgUrl;
    this.shortDescription = shortDescription;
  }

}
