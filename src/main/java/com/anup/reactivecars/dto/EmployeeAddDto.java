package com.anup.reactivecars.dto;

import com.anup.reactivecars.entity.Company;
import com.anup.reactivecars.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeAddDto {

    private Company company;

    private Employee employee;
}
