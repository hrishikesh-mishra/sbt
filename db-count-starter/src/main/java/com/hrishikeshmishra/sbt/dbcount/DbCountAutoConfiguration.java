package com.hrishikeshmishra.sbt.dbcount;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by hrishikesh.mishra on 08/08/16.
 */
@Configuration
public class DbCountAutoConfiguration {

    @Bean
    public DbCountRunner dbCountRunner(Collection<CrudRepository> repositories){
        return  new DbCountRunner(repositories);
    }
}
