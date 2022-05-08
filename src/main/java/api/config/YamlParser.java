package api.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class YamlParser {
    private static final ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
    private static final File crawlerConfigFile = new File("src/main/resources/crawler_config.yaml");

    private YamlParser() {
    }

    public static <T> T getParsedCrawlerConfig(Class<T> crawlerClz) throws Exception {
        return objectMapper.readValue(crawlerConfigFile, crawlerClz);
    }
}
