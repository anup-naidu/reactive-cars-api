package com.anup.reactivecars.repository;

import com.anup.reactivecars.entity.Company;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.List;

public interface CompanyRepository extends ReactiveCrudRepository<Company, Integer> {

}
