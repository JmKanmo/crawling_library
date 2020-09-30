package api.builder.google.search;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@NonNull
@Builder
public class GoogleSearchBuilder {
    private String keyword = "";
    private String type = "";

    public String invokeCrawling() {
        return "";
    }
}
