package com.anup.reactivecars.repository;

import com.anup.reactivecars.entity.Cars;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CarsRepository extends ReactiveCrudRepository<Cars, Integer> {
}
