package com.hee.service;

import com.hee.dto.HeeMongo;
import com.hee.repository.ReactiveMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class HeeMongoService {

    static AtomicInteger atomicInteger = new AtomicInteger();

    @Autowired
    ReactiveMongoRepository mongoRepository;

    public Mono<Void> insert() {
        int atomInt = atomicInteger.incrementAndGet();
        System.out.println("atomint: " + atomInt);

        mongoRepository.save(new HeeMongo("id" + atomInt, "test")).subscribe();

        return Mono.empty();
    }

    public Mono<String> insertWithHandler() {
        int atomInt = atomicInteger.incrementAndGet();
        System.out.println("atomint: " + atomInt);

        mongoRepository.save(new HeeMongo("hand" + atomInt, "test")).subscribe();

        return Mono.just("insertWithHandler");
    }
}
