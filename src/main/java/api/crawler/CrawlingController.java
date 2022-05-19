package api.crawler;

import java.util.*;

public class CrawlingController {
    private static final CrawlingWorker crawlingWorker = new CrawlingWorker();

    public static Optional<Map<String, String>> crawling(String url, String keyword) {
        return Optional.ofNullable(crawlingWorker.crawling(url, keyword));
    }

    public static String[] getCrawlingUrls() {
        return crawlingWorker.keySet().toArray(new String[0]);
    }
}
