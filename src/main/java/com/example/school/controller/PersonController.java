package com.example.school.controller;

import com.example.school.bd.dao.PersonRepository;
import com.example.school.core.eir.bo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/v1/person", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Person> getAll() { return personRepository.findAll(); }

    /*@RequestMapping(method = RequestMethod.POST)
    public  Object save(@RequestBody(required = true) Person person) {return this.personRepository.save(person);}*/
}
