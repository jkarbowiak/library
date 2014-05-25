package com.aksoft.library.service.impl;

import com.aksoft.library.service.PersonService;
import com.aksoft.library.to.Person;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PMG on 2014-05-25.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private final Map<String, Person> personMap;

    private PersonServiceImpl() {
        personMap = new HashMap<>();
        personMap.put("1", new Person("1", "Tom", "Jobs"));
    }

    @Override
    public Person getPerson(String id) {
        Person person = personMap.get(id);
        if (person == null) {
            throw new RuntimeException("Person not found");
        }
        return person;
    }

    @Override
    public void addPerson(Person person) {
        personMap.put(person.getId(), person);
    }

}
