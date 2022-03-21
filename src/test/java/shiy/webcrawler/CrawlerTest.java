package shiy.webcrawler;

//import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import shiy.webcrawler.domain.pokemon.Pokemon;
import shiy.webcrawler.domain.pokemon.PokemonConstants;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

//@Slf4j
@SpringBootTest
class CrawlerTest {

    @Test
    public void html() throws Exception {
        Crawler crawler = new Crawler();
        String title = crawler.html("https://www.google.com/").title();
        assertThat(title).isEqualTo("Google");
    }

    @Test
    public void elements() throws Exception {
        Crawler crawler = new Crawler();
        String title = crawler.elements("https://www.google.com/", "title").text();
        assertThat(title).isEqualTo("Google");
    }

/*    @Test
    void pokemon_info() throws Exception {
        Crawler crawler = new Crawler();
        Elements infocards = crawler.elements(PokemonConstants.URL, PokemonConstants.SELECTOR_INFOCARD);

        List<Pokemon> pokemons = new ArrayList<>();
        for (Element elem : infocards) {

            Elements infocard_data = elem.select(PokemonConstants.SELECTOR_INFOCARD_DATA);
            Elements infocard_img = elem.select(PokemonConstants.SELECTOR_INFOCARD_IMG);

            String number = infocard_data.select("small").first().text();
            String name = infocard_data.select("a.ent-name").text();
            List<String> types = infocard_data.select("small > a.itype").eachText();
            String img = infocard_img.select("a[href]").attr("href");

            pokemons.add(new Pokemon(number, name, types, img));
        }

        pokemons.forEach(pokemon -> {
            System.out.println(pokemon.toString());
        } );
    }*/
}