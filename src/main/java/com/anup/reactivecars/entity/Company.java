package com.anup.reactivecars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "company")
//@SecondaryTable(name = "employee", pkJoinColumns = @rimaryKeyJoinColumn(name = "emp_id"))
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    Long id;

    @Column(name = "last_modified_by")
    String lastModifiedBy;

    @Column(name = "last_modified_when")
    Date lastModifiedWhen;

    @Column(name = "active_status")
    String activeStatus;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Employee> employeelist;


}
