package api.crawler;

import api.config.YamlParser;
import api.config.dto.Crawler;
import api.config.dto.CrawlerConfig;
import api.parser.JsoupParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CrawlingWorker {
    private static final Map<String, List<Crawler>> crawlerMap = YamlParser.getParsedCrawlerConfig(CrawlerConfig.class)
            .get().getCrawlers()
            .stream().collect(Collectors.groupingBy(Crawler::getSite, Collectors.toList()));

    private static final JsoupParser jsoupParser = new JsoupParser();

    public Map<String, String> crawling(String topic, String keyword) {
        Map<String, String> crawlingResult = new HashMap<>(); // Map<String,Map<String,DTO>> 방식으로 진행

        crawlerMap.entrySet().forEach(entry -> {
            Crawler crawler = entry.getValue().stream().findFirst().get();
            /**
             * 검색 쿼리 생성 , 크롤링 후, 검색 결과 JSON 형태로 변환 및 결과 반환
             * 구글 예시)  https://www.google.com/search?tbm=shop&q=%EC%9B%B9%ED%81%AC%EB%A1%A4%EB%A7%81
             * url + search + category + '=' + types[{topic}] + '&' + keyword + '=' + {keyword}
             */
            StringBuilder searchQueryBuilder = new StringBuilder();
            searchQueryBuilder.append(crawler.getUrl() + crawler.getCategory())
                    .append("=" + (crawler.getTypes().stream().filter(type -> type.equals(topic)).findFirst().get()))
                    .append("&" + crawler.getKeyword() + "=" + keyword);

            //  TODO => jsoup parser 를 이용해 파싱 후, 결과 반환
            // crawlingResult.put(crawler.getSite(), jsonParser.crawling(...)); 이런 방식으로 처리
        });
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
