package com.anup.reactivecars.repository;

import com.anup.reactivecars.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {


}
