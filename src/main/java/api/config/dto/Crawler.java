package api.config.dto;

import java.util.List;

public class Crawler {
    private String site;
    private String url;
    private String search;
    private String keyword;
    private String category;
    private List<String> types;

    public Crawler() {
    }

    public Crawler(String site, String url, String search, String keyword, String category, List<String> types) {
        this.site = site;
        this.url = url;
        this.search = search;
        this.keyword = keyword;
        this.category = category;
        this.types = types;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
}
