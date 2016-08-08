package com.hrishikeshmishra.sbt.dbcount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by hrishikesh.mishra on 08/08/16.
 */
public class DbCountRunner implements CommandLineRunner {

    protected final Log log = LogFactory.getLog(getClass());
    private Collection<CrudRepository> repositories;

    public DbCountRunner(Collection<CrudRepository> repositories) {
        this.repositories = repositories;
    }

    @Override
    public void run(String... strings) throws Exception {
        repositories.forEach(crudRepository -> log.info(String.format("%s has %d entries", getRepositoryName(crudRepository.getClass()), crudRepository.count())));
    }

    private static String getRepositoryName(Class crudRepositoryClass){
        for(Class repositoryInterface : crudRepositoryClass.getInterfaces()){
            if(repositoryInterface.getName().startsWith("com.hrishikeshmishra.sbt.bookpub")){
                return repositoryInterface.getName();
            }
        }
        return "UnKnowRepository";
    }
}
