package com.inventamos.springreactive.business.api;

import com.inventamos.springreactive.business.entity.Person;
import com.inventamos.springreactive.business.service.PersonService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Flux<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping
    public Mono<Person> createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @GetMapping("/{id}")
    public Mono<Person> getPerson(@PathVariable Long id) {
        return personService.getPerson(id);
    }

    @PutMapping("/{id}")
    public Mono<Person> updatePerson(@PathVariable Long id, @RequestBody Person person) {
        return personService.updatePerson(id, person);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deletePerson(@PathVariable Long id) {
        return personService.deletePerson(id);
    }
}