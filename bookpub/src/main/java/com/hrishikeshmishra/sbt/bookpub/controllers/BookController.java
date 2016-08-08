package com.hrishikeshmishra.sbt.bookpub.controllers;

import com.hrishikeshmishra.sbt.bookpub.IsbnEditor;
import com.hrishikeshmishra.sbt.bookpub.entities.Book;
import com.hrishikeshmishra.sbt.bookpub.entities.Isbn;
import com.hrishikeshmishra.sbt.bookpub.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hrishikesh.mishra
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @RequestMapping(value =  "/{isbn}", method = RequestMethod.GET)
    public Book getBook(@PathVariable Isbn isbn){
        return bookRepository.findBookByIsbn(isbn.getIsbn());
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Isbn.class, new IsbnEditor());
    }

}
