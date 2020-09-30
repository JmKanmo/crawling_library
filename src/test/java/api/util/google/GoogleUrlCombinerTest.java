package api.util.google;

import api.builder.google.GoogleSearchBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoogleUrlCombinerTest {
    @Test
    public void searchUrlCombineTest() {
        GoogleSearchBuilder googleSearchBuilder = GoogleSearchBuilder.builder().keyword("hello").build();
        String url = GoogleUrlCombiner.getCombinedSearchUrl(GoogleCrawlingUtils.GOOGLE_SEARCH, googleSearchBuilder.getKeyword(), googleSearchBuilder.getType());
        assertEquals(url, "https://www.google.com/search?q=hello&tbm=");

        googleSearchBuilder.setType("vid");
        url = GoogleUrlCombiner.getCombinedSearchUrl(GoogleCrawlingUtils.GOOGLE_SEARCH, googleSearchBuilder.getKeyword(), googleSearchBuilder.getType());
        assertEquals(url, "https://www.google.com/search?q=hello&tbm=vid");
    }
}