package com.hee.controller;

import com.hee.service.HeeMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HeeHandler {

    @Autowired
    HeeMongoService heeMongoService;
    public Mono<ServerResponse> putDummyData(ServerRequest serverRequest) {

        Mono monoRes = heeMongoService.insertWithHandler();
        return ServerResponse.ok().body(monoRes, String.class);
    }
}
