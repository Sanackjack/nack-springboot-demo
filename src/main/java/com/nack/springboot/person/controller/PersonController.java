package com.nack.springboot.person.controller;

import com.nack.springboot.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/person")
    public ResponseEntity<?> getperson(@RequestParam(value = "name") String name) throws Exception {

        return ResponseEntity.ok(personService.getPersonByname(name));

    }
}
