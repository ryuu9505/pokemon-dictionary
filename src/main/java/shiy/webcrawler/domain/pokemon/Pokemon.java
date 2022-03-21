package shiy.webcrawler.domain.pokemon;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Pokemon {

    @Id
    @GeneratedValue
    @Column(name = "pokemon_id")
    private Long id;

    private String name;
    private String image;

    @OneToMany(mappedBy = "pokemon")
    private List<PokemonType> types;
}
