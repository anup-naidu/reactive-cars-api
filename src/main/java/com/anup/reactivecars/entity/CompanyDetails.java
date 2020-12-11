package com.anup.reactivecars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_details")
@SecondaryTable(name = "employee_education_details", pkJoinColumns = @PrimaryKeyJoinColumn(name = "emp_id"))
public class CompanyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    Long id;





}
