package com.aksoft.library.to;

/**
 * Created by PMG on 2014-05-25.
 */
public class Person {
    private String id;
    private String name;
    private String surname;

    // for json
    protected Person() {
    }

    public Person(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

   }
