package com.sameperson.mp3hosting.config;

import org.hashids.Hashids;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Autowired
    private Environment env;

    @Bean
    public Hashids hashids() {
        return new Hashids(env.getProperty("mp3hosting.hash.salt"));
    }
}
