package com.inventamos.springreactive.business.service;

import com.inventamos.springreactive.business.entity.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {

    public Flux<Person> getAllPersons();

    public Mono<Person> createPerson(Person person);

    public Mono<Person> getPerson(Long id);

    public Mono<Person> updatePerson(Long id, Person person);

    public Mono<Void> deletePerson(Long id);
}
