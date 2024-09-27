package com.example.logbookprettyjsonissue.logbook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.BodyFilter;
import org.zalando.logbook.HttpLogWriter;
import org.zalando.logbook.json.PrettyPrintingJsonBodyFilter;

import java.util.List;

@Configuration
public class LogbookConfig {

    @Bean
    public HttpLogWriter writer(CustomLogbookLoggerProperties properties) {
        return new CustomHttpLogWriter(properties);
    }

    @Bean
    public BodyFilter prettyPrintingJsonBodyFilter() {
        return new PrettyPrintingJsonBodyFilter();
    }
}