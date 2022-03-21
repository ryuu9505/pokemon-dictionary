package shiy.webcrawler.pokemon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class Pokemon {

    private final String number;
    private final String name;
    private final List<String> types;
    private String image;

    public void setImage(String image) {
        this.image = image;
    }
}
