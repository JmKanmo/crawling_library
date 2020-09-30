package api.util;

public class UrlCombiner {
    public static String getCombinedUrl(String site, String keyword, String type) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(site)
                .append("?q=")
                .append(keyword)
                .append("&tbm=")
                .append(type);

        return stringBuilder.toString();
    }
}
