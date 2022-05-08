package api.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * crawling controller
 * author: JmKanmo
 */
public class SearchCrawler {
    private static String selectRcList(Document document) {
        return null;
    }

    public static String crawling(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        Map<String, String> crawlingData = new HashMap<>();
        return url;
    }
}
