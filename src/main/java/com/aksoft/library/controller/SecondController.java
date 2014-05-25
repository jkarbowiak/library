package com.aksoft.library.controller;

import com.aksoft.library.service.PersonService;
import com.aksoft.library.to.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by PMG on 2014-05-25.
 */
@Controller
@RequestMapping("/person")
public class SecondController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/get/{id}")
    public @ResponseBody Person getPerson(@PathVariable String id) {
        return personService.getPerson(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> addPerson(@RequestBody Person person) {
        personService.addPerson(person);
        return new ResponseEntity<>("Person added", HttpStatus.CREATED);
    }


}
