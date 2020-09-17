package com.web.coviddash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@SpringBootApplication
@EnableScheduling
public class CovidWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidWebappApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
