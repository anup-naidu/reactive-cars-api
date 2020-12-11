package com.anup.reactivecars.repository;

import com.anup.reactivecars.entity.Education;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EducationRepository extends ReactiveCrudRepository<Education, Integer> {
}
