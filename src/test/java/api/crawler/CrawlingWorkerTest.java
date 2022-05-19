package api.crawler;

import org.junit.Test;

import static org.junit.Assert.*;

public class CrawlingWorkerTest {
    @Test
    public void crawlerMapTest() {
        try {
            assertEquals(CrawlingWorker.getCrawlerMapEmpty(), false);
            assertNotEquals(CrawlingWorker.getCrawlerMapSize(),0);
        } catch (Exception e) {
            fail();
        }
    }
}
