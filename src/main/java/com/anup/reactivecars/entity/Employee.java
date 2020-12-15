package com.anup.reactivecars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
//@SecondaryTable(name = "employee_education_details", pkJoinColumns = @PrimaryKeyJoinColumn(name = "emp_id"))
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    Long id;

    @Column(name = "emp_first_name")
    String empFirstName;

    @Column(name = "emp_last_name")
    String empLastName;

    @Column(name = "emp_city")
    String empCity;

    @Column(name = "emp_gender")
    String empGender;

    @Column(name = "emp_dept")
    String empDept;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "emp_id", nullable = false)
    private Company company;

}
