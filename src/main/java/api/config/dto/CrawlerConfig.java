package api.config.dto;

import java.util.List;

public class CrawlerConfig {
    private List<String> urls;
    private List<Crawler> crawlers;

    public CrawlerConfig() {
    }

    public CrawlerConfig(List<String> urls, List<Crawler> crawlers) {
        this.urls = urls;
        this.crawlers = crawlers;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public List<Crawler> getCrawlers() {
        return crawlers;
    }

    public void setCrawlers(List<Crawler> crawlers) {
        this.crawlers = crawlers;
    }

    @Override
    public String toString() {
        return "CrawlerConfig{" +
                "urls=" + urls +
                ", crawlers=" + crawlers +
                '}';
    }
}
