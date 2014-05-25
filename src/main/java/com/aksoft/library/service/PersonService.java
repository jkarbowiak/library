package com.aksoft.library.service;

import com.aksoft.library.to.Person;
import org.springframework.http.ResponseEntity;

/**
 * Created by PMG on 2014-05-25.
 */
public interface PersonService {

    Person getPerson(String id);

    void addPerson(Person person);
}
