package api.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class YamlParser {
    private static final ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
    private static final File crawlerConfigFile = new File("src/main/resources/crawler_config.yaml");

    private YamlParser() {
    }

    public static <T> Optional<T> getParsedCrawlerConfig(Class<T> crawlerClz) {
        try {
            return Optional.ofNullable(objectMapper.readValue(crawlerConfigFile, crawlerClz));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
