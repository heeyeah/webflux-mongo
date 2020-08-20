package com.hee.repository;

import com.hee.dto.HeeMongo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReactiveMongoRepository extends ReactiveCrudRepository<HeeMongo, String> {
    
}
