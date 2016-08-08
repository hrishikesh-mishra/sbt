package com.hrishikeshmishra.sbt.bookpub.entities;

/**
 * Created by hrishikesh.mishra on 08/08/16.
 */
public class Isbn {
    private String isbn;

    public Isbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
