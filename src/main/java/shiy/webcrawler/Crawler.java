package shiy.webcrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Crawler {

    public Document html(String url) throws Exception{
        return Jsoup.connect(url).get();
    }

    public Elements elements(String url, String selector) throws Exception{
        return html(url).select(selector);
    }
}
