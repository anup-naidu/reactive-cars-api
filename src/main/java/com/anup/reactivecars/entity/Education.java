package com.anup.reactivecars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_education_details")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    Long id;

    @OneToMany()
    @Column
    Long emp_id;


    @Column(name = "emp_degree")
    String empDegree;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "emp_id")
    Employee employee;



}
