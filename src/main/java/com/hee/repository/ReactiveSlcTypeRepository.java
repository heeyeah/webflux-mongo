package com.hee.repository;

import com.hee.dto.HeeMongo;
import com.hee.dto.SlcTypeDto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReactiveSlcTypeRepository  extends ReactiveCrudRepository<SlcTypeDto, String> {
}
