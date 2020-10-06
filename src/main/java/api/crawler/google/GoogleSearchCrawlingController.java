package api.crawler.google;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GoogleSearchCrawlingController {
    // 실질적인 크롤링 작업 담당 (crawler package 내에서)

    private static String selectRcList(Document document) {
        return null;
    }

    public static String crawling(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        Map<String, String> crawlingData = new HashMap<>();
        return url;
    }
}
