package shiy.webcrawler.domain.pokemon;

import javax.persistence.*;

@Entity
public class PokemonType {

    @Id
    @GeneratedValue
    @Column(name = "pokemon_type_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    Pokemon pokemon;

    @ManyToOne
    @JoinColumn(name = "type_id")
    Type type;

}
