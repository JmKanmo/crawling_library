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
        Document document = Jsoup.connect("https://search.daum.net/search?w=tot&q=바보멍충이").get();
//        Document google2 = Jsoup.connect("http://www.google.com").post();

//        Connection.Response response = Jsoup.connect("http://www.google.com")
//                .method(Connection.Method.GET)
//                .execute();
//        Document google3 = response.parse();
        String text = document.text();
        System.out.println(text);
    }
}
