package api.core;

import api.config.YamlParser;
import api.config.dto.Crawler;
import api.config.dto.CrawlerConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CrawlingCore {
    private static final Map<String, List<Crawler>> crawlerMap = YamlParser.getParsedCrawlerConfig(CrawlerConfig.class)
            .get().getCrawlers().parallelStream().collect(
                    Collectors.groupingBy(Crawler::getSite, Collectors.toList()));

    public Map<String, String> crawling(String topic, String keyword) {
        Map<String, String> crawlingResult = new HashMap<>();

        crawlerMap.entrySet().forEach(entry -> {
            Crawler crawler = entry.getValue().stream().findFirst().get();
            StringBuilder searchQuery = new StringBuilder();
            /**
             * 구글 예시)  https://www.google.com/search?tbm=shop&q=%EC%9B%B9%ED%81%AC%EB%A1%A4%EB%A7%81
             * url + search + category + '=' + types[{topic}] + '&' + keyword + '=' + {keyword}
             *
             */
        });
        // 검색 쿼리 생성 , 크롤링 후, 검색 결과 JSON 형태로 변환 및 결과 반환
        return crawlingResult;
    }

    public Set<String> keySet() {
        return crawlerMap.keySet();
    }

    public static int getCrawlerMapSize() {
        return crawlerMap.size();
    }

    public static boolean getCrawlerMapEmpty() {
        return crawlerMap.isEmpty();
    }
}
