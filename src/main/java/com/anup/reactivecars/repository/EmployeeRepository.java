package com.anup.reactivecars.repository;

import com.anup.reactivecars.dto.EmployeeDetailsResponse;
import com.anup.reactivecars.entity.Employee;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.List;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {

    @Query("")
    public List<EmployeeDetailsResponse> getJoinEduDetails();
}
