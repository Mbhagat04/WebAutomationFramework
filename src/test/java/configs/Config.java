package configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources(
    @PropertySource("classpath:foo.properties")
)
public class Config {

    @Value("${application.url}")
    private String applicationUrl;
}
