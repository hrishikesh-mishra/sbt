package com.hrishikeshmishra.sbt.bookpub.repository;

import com.hrishikeshmishra.sbt.bookpub.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hrishikesh.mishra on 07/08/16.
 */

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    public Book findBookByIsbn(String isbn);
}
