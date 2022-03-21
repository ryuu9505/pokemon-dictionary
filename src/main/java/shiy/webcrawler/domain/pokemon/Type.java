package shiy.webcrawler.domain.pokemon;

import javax.persistence.*;

@Entity
public class Type {

    @Id
    @GeneratedValue
    @Column(name = "type_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypeName typeName;

}
