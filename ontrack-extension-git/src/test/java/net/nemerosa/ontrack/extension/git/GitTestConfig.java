package net.nemerosa.ontrack.extension.git;

import org.springframework.boot.actuate.health.HealthAggregator;
import org.springframework.boot.actuate.health.OrderedHealthAggregator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GitTestConfig {

    @Bean
    public HealthAggregator healthAggregator() {
        return new OrderedHealthAggregator();
    }

}
