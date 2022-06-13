package api.config.dto;

import java.util.List;

public class CrawlerConfig {
    private List<Crawler> crawlers;

    public CrawlerConfig() {}

    public CrawlerConfig(List<Crawler> crawlers) {
        this.crawlers = crawlers;
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
                "crawlers=" + crawlers +
                '}';
    }
}
