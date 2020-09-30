package api.util.google;

public class GoogleUrlCombiner {
    public static String getCombinedSearchUrl(String site, String keyword, String type) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(site)
                .append("?q=")
                .append(keyword)
                .append("&tbm=")
                .append(type);

        return stringBuilder.toString();
    }
}
