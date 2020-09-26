import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestCrawling {
    @Test
    public void testSearch() throws IOException {
        // 간략화된 GET, POST
        Document document = Jsoup.connect("https://www.google.com/maps/search/%EB%8F%99%EB%8C%80%EB%AC%B8").get();
//        Document google2 = Jsoup.connect("http://www.google.com").post();

//        Connection.Response response = Jsoup.connect("http://www.google.com")
//                .method(Connection.Method.GET)
//                .execute();
//        Document google3 = response.parse();
        String text = document.text();
        System.out.println(text);
    }
}
