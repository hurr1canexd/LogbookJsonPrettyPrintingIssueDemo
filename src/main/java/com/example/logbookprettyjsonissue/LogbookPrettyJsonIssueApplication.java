package com.example.logbookprettyjsonissue;

import com.example.logbookprettyjsonissue.logbook.CustomLogbookLoggerProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {CustomLogbookLoggerProperties.class})
public class LogbookPrettyJsonIssueApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogbookPrettyJsonIssueApplication.class, args);
    }

}
