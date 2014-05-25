package com.aksoft.library.to;

/**
 * Created by PMG on 2014-05-25.
 */
public class Book {
    private final String title;
    private final Person author;

    public Book(String title, Person author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Person getAuthor() {
        return author;
    }
}
