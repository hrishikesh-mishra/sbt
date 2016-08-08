package com.hrishikeshmishra.sbt.bookpub.repository;

import com.hrishikeshmishra.sbt.bookpub.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by hrishikesh.mishra on 07/08/16.
 */

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long> {

    public Book findBookByIsbn(String isbn);
}
