package com.example.logbookprettyjsonissue.logbook;

import ch.qos.logback.classic.Level;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties("logbook.logger")
public class CustomLogbookLoggerProperties {

    @NotEmpty
    private String name;

    @NotEmpty
    private String level;

    public Level getLevel() {
        return Level.valueOf(level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}