package com.inventamos.springreactive.business.service.impl;

import com.inventamos.springreactive.business.entity.Person;
import com.inventamos.springreactive.business.repository.PersonRepository;
import com.inventamos.springreactive.business.service.PersonService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Flux<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Mono<Person> createPerson(Person person) {
        return personRepository.save(person);
    }

    public Mono<Person> getPerson(Long id) {
        return personRepository.findById(id);
    }

    public Mono<Person> updatePerson(Long id, Person person) {
        return personRepository.findById(id)
                .flatMap(existingPerson -> {
                    existingPerson.setName(person.getName());
                    existingPerson.setAge(person.getAge());
                    existingPerson.setCountry(person.getCountry());
                    return personRepository.save(existingPerson);
                });
    }

    public Mono<Void> deletePerson(Long id) {
        return personRepository.deleteById(id);
    }
}
