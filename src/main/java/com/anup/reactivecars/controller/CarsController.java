package com.anup.reactivecars.controller;

import com.anup.reactivecars.model.Cars;
import com.anup.reactivecars.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * URL Endpoints:
 * GET - http://localhost:8080/cars
 * POST - http://localhost:8080/cars
 * PUT - http://localhost:8080/cars/2
 * DELETE - http://localhost:8080/cars/3
 */

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    CarsRepository carsRepository;

    @GetMapping
    public Flux<Cars> getCars() {
        return carsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono getCar(@PathVariable Integer id) {
        return carsRepository.findById(id);
    }

    @PostMapping
    public Mono<Cars> createCar(@RequestBody Cars car) {
        return carsRepository.save(car);
    }

    @PutMapping("/{id}")
    public Mono<Cars> updateCar(@RequestBody Cars car, @PathVariable Integer id) {
        return carsRepository.findById(id) //get the existing element from the DB using the id
                            .map((c) -> {
                                c.setCarname(car.getCarname());
                                return c;
                            }).flatMap(c -> carsRepository.save(c));
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteCar(@PathVariable Integer id) {
        return carsRepository.deleteById(id);
    }

}
