package api.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class CrawlingCoreTest {
    @Test
    public void crawlerMapTest() {
        try {
            assertEquals(CrawlingCore.getCrawlerMapEmpty(), false);
            assertNotEquals(CrawlingCore.getCrawlerMapSize(),0);
        } catch (Exception e) {
            fail();
        }
    }
}
