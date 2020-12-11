package com.anup.reactivecars.controller;

import com.anup.reactivecars.entity.Cars;
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

    @GetMapping("/getAllCars")
    public Flux<Cars> getCars() {
        System.out.println("getting all cars from the producer..");
        return carsRepository.findAll();
    }//use Flux when you return multiple data elements

    @GetMapping("/{id}")
    public Mono getCar(@PathVariable Integer id) {
        System.out.println("getting a single car with "+id+" for the producer..");
        return carsRepository.findById(id);
    }

    @PostMapping
    public Mono<Cars> createCar(@RequestBody Cars car) {
        System.out.println("Creating a new car inside the producer..");
        return carsRepository.save(car);
    }

    @PutMapping("/{id}")
    public Mono<Cars> updateCar(@RequestBody Cars car, @PathVariable Integer id) {
        System.out.println("finding a car with "+id+" inside the producer..");
        return carsRepository.findById(id) //get the existing element from the DB using the id
                            .map((c) -> {
                                c.setCarname(car.getCarname());
                                return c;
                            }).flatMap(c -> carsRepository.save(c));
    }
    

    @DeleteMapping("/{id}")
    public Mono<Void> deleteCar(@PathVariable Integer id) {
        System.out.println("deleting a car with "+id+" inside the producer..");
        return carsRepository.deleteById(id);
    }

}
