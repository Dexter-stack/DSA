package org.dexter.generic.media.core;

public class Book extends Media{

    private String author;
    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
