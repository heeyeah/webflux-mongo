package com.hee.config;


import com.hee.controller.HeeHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Configuration
@EnableWebFlux
public class HeeMongoConfig implements WebFluxConfigurer {

    @Bean
    public RouterFunction<ServerResponse> routes(HeeHandler handler) {
        return RouterFunctions.route(POST("/handler"), handler::putDummyData)
                .andRoute(POST("/type").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::addSlcType)
                ;
    }
}
