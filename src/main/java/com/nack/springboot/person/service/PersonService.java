package com.nack.springboot.person.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nack.springboot.entity.Person;
import com.nack.springboot.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class PersonService {


    @Autowired
    private PersonRepository personRepository;

    public String getPersonByname(String name) throws Exception {

       Person person = personRepository.findByName(name);
       String response = "";
       try {
           ObjectMapper mapper = new ObjectMapper();
           response = mapper.writeValueAsString(person);
       }catch (Exception e){
           throw new Exception();
       }
      return response;
    }


}
