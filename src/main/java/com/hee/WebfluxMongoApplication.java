package com.hee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;


@SpringBootApplication
public class WebfluxMongoApplication {


    public static void main(String[] args) {
        SpringApplication.run(WebfluxMongoApplication.class, args);
    }
}
