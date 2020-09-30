package api.builder.google;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoogleSearchBuilderTest {
    @Test
    public void lombokFieldInitTest() {
        GoogleSearchBuilder googleSearchBuilder = GoogleSearchBuilder.builder().keyword("hello world").build();
        assertEquals(googleSearchBuilder.getKeyword(), "hello world");
        assertEquals(googleSearchBuilder.getType(), "");
    }
}