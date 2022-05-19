package api.crawler;

import org.junit.Test;

import static org.junit.Assert.*;

public class CrawlingControllerTest {
    @Test
    public void getCrawlingUrls() {
        assertNotNull(CrawlingController.getCrawlingUrls());
        assertNotEquals(CrawlingController.getCrawlingUrls().length, 0);
    }
}