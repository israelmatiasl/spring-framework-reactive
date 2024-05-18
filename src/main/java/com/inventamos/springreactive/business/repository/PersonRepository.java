package com.inventamos.springreactive.business.repository;

import com.inventamos.springreactive.business.entity.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {
}