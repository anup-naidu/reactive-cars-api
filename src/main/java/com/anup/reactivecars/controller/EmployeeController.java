package com.anup.reactivecars.controller;

import com.anup.reactivecars.dto.EmployeeDetailsResponse;
import com.anup.reactivecars.repository.EducationRepository;
import com.anup.reactivecars.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EducationRepository educationRepository;

        @GetMapping("/getEmployeeEducationDetails")
    public Flux<EmployeeDetailsResponse> getEmployeeEducationDetails(@RequestBody EmployeeDetailsResponse employeeDetailsRequest) {
        return
    }
}
