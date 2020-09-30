package api.builder.google;

import api.crawler.google.GoogleSearchCrawlingController;
import api.util.google.GoogleUrlCombiner;
import api.util.google.GoogleCrawlingUtils;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class GoogleSearchBuilder {
    @NonNull
    private String keyword;

    @NonNull
    @Builder.Default
    private String type = "";

    public String invokeCrawling() {
        String url = GoogleUrlCombiner.getCombinedSearchUrl(GoogleCrawlingUtils.GOOGLE_SEARCH, keyword, type);
        return GoogleSearchCrawlingController.crawling(url);
    }
}
