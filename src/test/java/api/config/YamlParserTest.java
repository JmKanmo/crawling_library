package api.config;

import api.config.dto.Crawler;
import api.config.dto.CrawlerConfig;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class YamlParserTest {
    @Test
    public void parseTest() {
        try {
            CrawlerConfig crawlerConfig = YamlParser.getParsedCrawlerConfig(CrawlerConfig.class);
            List<Crawler> crawlerList = crawlerConfig.getCrawlers();

            assertNotNull(crawlerConfig);
            assertNotNull(crawlerList);
        } catch (Exception e) {
            fail();
        }
    }
}
