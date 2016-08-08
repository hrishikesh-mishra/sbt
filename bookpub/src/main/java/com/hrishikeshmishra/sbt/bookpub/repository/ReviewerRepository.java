package com.hrishikeshmishra.sbt.bookpub.repository;

import com.hrishikeshmishra.sbt.bookpub.entities.Reviewer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by hrishikesh.mishra on 07/08/16.
 */
@RepositoryRestResource
public interface ReviewerRepository  extends PagingAndSortingRepository<Reviewer, Long> {
}
