package com.hee.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hee.dto.SlcTypeDto;
import com.hee.service.HeeMongoService;
import com.mongodb.internal.connection.Server;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.BodyExtractors;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class HeeHandler {

    private static final Logger logger = LoggerFactory.getLogger(HeeHandler.class);
    @Autowired
    HeeMongoService heeMongoService;

    public Mono<ServerResponse> putDummyData(ServerRequest serverRequest) {

        Mono monoRes = heeMongoService.insertWithHandler();
        return ServerResponse.ok().body(monoRes, String.class);
    }

    public Mono<ServerResponse> addSlcType(ServerRequest serverRequest) {

        JSONPObject j = serverRequest.bodyToMono(JSONPObject.class).toProcessor().peek();

        serverRequest.bodyToMono(SlcTypeDto.class)
                .doOnSuccess(slcTypeDto -> logger.info("{}", slcTypeDto))
                .doOnSuccess(slcTypeDto -> heeMongoService.insertSlcTypeData(slcTypeDto))
                .log().subscribe();

        return ServerResponse.ok().build();
    }
}
