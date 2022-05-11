package api.crawler;

import api.core.CrawlingCore;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.*;

public class CrawlingController {
    private static final CrawlingCore crawlingCore = new CrawlingCore();

    public static String crawling(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        Map<String, String> crawlingData = new HashMap<>();
        return url;
    }

    public static Optional<Map<String, String>> crawling(String url, String keyword) {
        return Optional.ofNullable(crawlingCore.crawling(url, keyword));
    }

    public static String[] getCrawlingUrls() {
        return crawlingCore.keySet().toArray(new String[0]);
    }
}
