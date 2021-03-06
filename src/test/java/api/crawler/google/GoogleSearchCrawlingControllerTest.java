package api.crawler.google;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.*;

public class GoogleSearchCrawlingControllerTest {
    @Test
    public void testSelectRcTest() throws IOException {
        Document document = Jsoup.connect("https://www.google.com/search?q=아이유 좋은날").get();

        // 곡 검색 시, 관련정보 테스트
        Elements element_liYKde = document.select("div.liYKde .osrp-blk > div");
        System.out.println(element_liYKde);
        // 각각의 검색 자료(자료 링크)
        //        Elements element_rso = document.select("div#rso");
        //        System.out.println(element);

        // 동영상 정보 GT5me 더 테스트 해보기
//        Element element_gT5me = document.select("div.gT5me").first();
//        System.out.println(element_gT5me);
    }
}